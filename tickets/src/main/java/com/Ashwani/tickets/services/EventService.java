package com.Ashwani.tickets.services;

import com.Ashwani.tickets.domain.CreateEventRequest;
import com.Ashwani.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);

}
