package com.Ashwani.tickets.services;

import com.Ashwani.tickets.domain.entities.QrCode;
import com.Ashwani.tickets.domain.entities.Ticket;

import java.util.UUID;

public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);

    byte[] getQrCodeImageForUserAndTicket(UUID userId, UUID ticketId);
}
