package com.app.controller;

import com.app.dto.GetUserDto;
import com.app.proxy.FindUserProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class UsersController {

    private final FindUserProxy findUserProxy;

    @GetMapping
        public GetUserDto findByUsername() {
        System.out.println("bla");
            return findUserProxy.findByUsername("Kamil");
        }
    }

