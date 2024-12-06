package com.example.tickethub_producer.service;

import com.example.tickethub_producer.dto.ProduceTicketResponse;
import com.example.tickethub_producer.entity.Ticket;

import java.time.LocalDateTime;
import java.util.List;

public interface TicketService {

    ProduceTicketResponse createTicket(long userId, int performanceId, LocalDateTime time, int seatNumber, String payment);

    Long saveTicket();

    List<Ticket> checkUserTicket(Long userId);

    Ticket checkTicket(Long ticketId);

    boolean checkToken(Long ticketId, String token);

}
