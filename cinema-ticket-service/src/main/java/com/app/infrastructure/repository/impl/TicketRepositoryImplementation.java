package com.app.infrastructure.repository.impl;

import com.app.domain.Ticket;
import com.app.domain.repository.TicketRepository;
import com.app.infrastructure.repository.jpa.JpaTicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class TicketRepositoryImplementation implements TicketRepository {

    private final JpaTicketRepository jpaTicketRepository;
    @Override
    public Optional<Ticket> save(Ticket ticket) {
        return Optional.of(jpaTicketRepository.save(ticket));
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return jpaTicketRepository.findById(id);
    }

    @Override
    public Optional<Ticket> findByUserId(Long userId) {
        return jpaTicketRepository.findTicketByUserId(userId);
    }
}
