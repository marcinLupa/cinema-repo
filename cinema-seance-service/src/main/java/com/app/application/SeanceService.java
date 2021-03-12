package com.app.application;

import com.app.application.exceptions.SeanceServiceException;
import com.app.domain.dto.FindSeanceDto;
import com.app.domain.dto.GetSeanceDto;
import com.app.domain.repository.SeanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SeanceService {

    private final SeanceRepository seanceRepository;

    public Optional<GetSeanceDto> getSeanceDtoByCinemaIdMovieId(FindSeanceDto findSeanceDto) {

        return Optional.of(seanceRepository
                .findByCinemaRoomIdAndMovieId(findSeanceDto.getCinemaId(), findSeanceDto.getMovieId()).
                        orElseThrow(() -> new SeanceServiceException("FIND BY CINEMA ID AND MOVIE ID EXC"))
                .getSeanceDto());
    }
}
