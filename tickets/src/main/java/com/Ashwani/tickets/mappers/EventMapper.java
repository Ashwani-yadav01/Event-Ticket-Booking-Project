package com.Ashwani.tickets.mappers;

import com.Ashwani.tickets.domain.CreateEventRequest;
import com.Ashwani.tickets.domain.CreateTicketTypeRequest;
import com.Ashwani.tickets.domain.dtos.CreateEventRequestDto;
import com.Ashwani.tickets.domain.dtos.CreateEventResponseDto;
import com.Ashwani.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.Ashwani.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {
    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);
    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);
}
