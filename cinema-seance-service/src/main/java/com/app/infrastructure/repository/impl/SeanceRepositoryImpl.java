package com.app.infrastructure.repository.impl;

import com.app.domain.Seance;
import com.app.domain.repository.SeanceRepository;
import com.app.infrastructure.repository.jpa.JpaSeanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class SeanceRepositoryImpl implements SeanceRepository {
    private final JpaSeanceRepository jpaSeanceRepository;

    @Override
    public Optional<Seance> findById(Long id) {
        return jpaSeanceRepository.findById(id);
    }

    @Override
    public Optional<Seance> add(Seance seance) {
        return Optional.of(jpaSeanceRepository.save(seance));
    }

    @Override
    public Optional<Seance> findByCinemaRoomIdAndMovieId(Long cinemaRoomId, Long movieId) {
        return jpaSeanceRepository.findByCinemaRoomIdAndMovieId(cinemaRoomId,movieId);
    }
}
