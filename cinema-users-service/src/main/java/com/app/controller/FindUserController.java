package com.app.controller;

import com.app.dto.GetUserDto;
import com.app.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/find")
@RequiredArgsConstructor
public class FindUserController {
private final UsersService usersService;

    @GetMapping("/id/{id}")
    private GetUserDto findById(@PathVariable Long id){
        return usersService.findById(id);
    }
    @GetMapping("/username/{username}")
    private GetUserDto findByUsername(@PathVariable String username){
        return usersService.findByUsername(username);
    }
    @GetMapping("/test")
    private String  test(){
        return "DZIALA";
    }
}
