package com.app.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class contr {

    @GetMapping("/test")
    public String appData() {

        return "sout";
    }
}