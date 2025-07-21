package com.Ashwani.tickets.mappers;

import com.Ashwani.tickets.domain.CreateEventRequest;
import com.Ashwani.tickets.domain.CreateTicketTypeRequest;
import com.Ashwani.tickets.domain.dtos.*;
import com.Ashwani.tickets.domain.entities.Event;
import com.Ashwani.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {
    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

    ListEventTicketTypeResponseDto toDto(TicketType ticketType);

    ListEventResponseDto toListEventResponseDto(Event event);
}
