package com.app.proxy;

import com.app.dto.GetUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("cinema-users-service")
public interface FindUserProxy {
//    @GetMapping("/find/id/{id}")
//    GetUserDto findById(@PathVariable("id") Long id);
//
//    @GetMapping("/find/username/{username}")
//    GetUserDto findByUsername(@PathVariable("username") String username);
}

