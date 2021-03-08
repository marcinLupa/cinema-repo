package com.app.domain.repository;

import com.app.domain.Ticket;

import java.util.Optional;

public interface TicketRepository {

    Optional<Ticket> save(Ticket ticket);

    Optional<Ticket> findById(Long id);

    Optional<Ticket> findByUserId(Long userId);


}
