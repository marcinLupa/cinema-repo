package com.app.mappers;

import com.app.dto.CreateUserDto;
import com.app.dto.GetUserDto;
import com.app.model.User;

public interface Mapper {

    static User fromCreateUserDtoToUser(CreateUserDto createUserDto){
        return createUserDto ==null?null: User.builder()
                .password(createUserDto.getPassword())
                .role(createUserDto.getRole())
                .username(createUserDto.getUsername())
                .build();
    }
    static GetUserDto fromUserToGetUserDto(User user) {
        return GetUserDto
                .builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
    }
}
