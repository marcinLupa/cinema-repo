package com.app.infrastructure.repository.jpa;

import com.app.domain.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaSeanceRepository extends JpaRepository<Seance, Long> {

    Optional<Seance> findByCinemaRoomIdAndMovieId(Long cinemaRoomId, Long movieId);
}
