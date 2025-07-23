package com.Ashwani.tickets.services;

import com.Ashwani.tickets.domain.entities.QrCode;
import com.Ashwani.tickets.domain.entities.Ticket;

public interface QrCodeService {

    QrCode generateQrCode(Ticket ticket);
}
