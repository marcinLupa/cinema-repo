package com.app.controller;

import com.app.dto.CreateUserDto;
import com.app.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class RegistrationController {

    private final UsersService usersService;

    @PostMapping("/register")
    private Long registerUser(@RequestBody CreateUserDto createUserDto){
        return usersService.createUser(createUserDto);
    }
}
