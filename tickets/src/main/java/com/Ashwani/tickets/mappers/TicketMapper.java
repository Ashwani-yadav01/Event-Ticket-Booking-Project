package com.Ashwani.tickets.mappers;

import com.Ashwani.tickets.domain.dtos.ListTicketResponseDto;
import com.Ashwani.tickets.domain.dtos.ListTicketTicketTypeResponseDto;
import com.Ashwani.tickets.domain.entities.Ticket;
import com.Ashwani.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TicketMapper {

    ListTicketTicketTypeResponseDto toListTicketTicketTypeResponseDto(TicketType ticketType);

    ListTicketResponseDto toListTicketResponseDto(Ticket ticket);
}
