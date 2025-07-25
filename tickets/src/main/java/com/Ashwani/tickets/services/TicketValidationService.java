package com.Ashwani.tickets.services;

import com.Ashwani.tickets.domain.entities.TicketValidation;

import java.util.UUID;


public interface TicketValidationService {
    TicketValidation validateTicketByQrCode(UUID qrCodeId);
    TicketValidation validateTicketManually(UUID ticketId);
}
