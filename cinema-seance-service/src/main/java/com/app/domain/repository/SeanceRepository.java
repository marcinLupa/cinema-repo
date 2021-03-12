package com.app.domain.repository;

import com.app.domain.Seance;

import java.util.List;
import java.util.Optional;

public interface SeanceRepository {

    Optional<Seance> findById(Long id);
    Optional<Seance> add(Seance seance);
    Optional<Seance> findByCinemaRoomIdAndMovieId(Long cinemaRoomId, Long movieId);

}
