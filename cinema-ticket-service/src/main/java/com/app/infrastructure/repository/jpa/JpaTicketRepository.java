package com.app.infrastructure.repository.jpa;

import com.app.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaTicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findTicketByUserId(Long userId);
}
