package com.app.application.service;

import com.app.application.TicketServiceException;
import com.app.domain.Ticket;
import com.app.domain.dto.GetTicketDto;
import com.app.domain.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {

private final TicketRepository ticketRepository;

public GetTicketDto getTicketDtoById(Long id){
    return ticketRepository.findById(id)
            .orElseThrow(()->new TicketServiceException("FIND BY ID EXC"))
            .toGetTicketDto();
}
}
