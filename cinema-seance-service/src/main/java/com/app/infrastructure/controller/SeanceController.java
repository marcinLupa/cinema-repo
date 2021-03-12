package com.app.infrastructure.controller;

import com.app.application.SeanceService;
import com.app.domain.dto.FindSeanceDto;
import com.app.domain.dto.GetSeanceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/seance")
public class SeanceController {

    private final SeanceService seanceService;

    @PostMapping("/find")
    public Optional<GetSeanceDto> findSeanceByCinemaIdMovieId(@RequestBody FindSeanceDto findSeanceDto) {
        return seanceService.getSeanceDtoByCinemaIdMovieId(findSeanceDto);
    }
}
