package com.app.controller;

import com.app.data.AppData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppDataController {
    private final AppData appData;

    @GetMapping("/app-data")
    public String appData() {
        return "GOTOWE "+
                appData.getAuthor() + ", " + appData.getVersion();
    }
}
