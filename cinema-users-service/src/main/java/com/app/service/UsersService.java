

package com.app.service;

import com.app.dto.CreateUserDto;
import com.app.dto.GetUserDto;

import com.app.exceptions.UserServiceException;
import com.app.mappers.Mapper;
import com.app.repo.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public Long createUser(CreateUserDto createUserDto) {
        if (createUserDto == null) {
            throw new UserServiceException("create user dto is null");
        }

        if (userRepository.findByUsername(createUserDto.getUsername()).isPresent()) {
            throw new UserServiceException("username already exists");
        }

        var user = Mapper.fromCreateUserDtoToUser(createUserDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository
                .save(user)
                .getId();
    }
    public GetUserDto findById(Long id) {
        return userRepository
                .findById(id)
                .map(Mapper::fromUserToGetUserDto)
                .orElseThrow(() -> new UserServiceException("cannot find user with id"));
    }

    public GetUserDto findByUsername(String username) {
        return userRepository
                .findByUsername(username)
                .map(Mapper::fromUserToGetUserDto)
                .orElseThrow(() -> new UserServiceException("cannot find user with username"));
    }
}