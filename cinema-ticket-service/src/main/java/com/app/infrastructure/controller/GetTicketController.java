package com.app.infrastructure.controller;

import com.app.application.service.TicketService;
import com.app.domain.dto.GetTicketDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/find")
public class GetTicketController {

    private final TicketService ticketService;

    @GetMapping("/id/{id}")
    public GetTicketDto getTicketDtoById(@PathVariable Long id) {
        return ticketService.getTicketDtoById(id);
    }
}
