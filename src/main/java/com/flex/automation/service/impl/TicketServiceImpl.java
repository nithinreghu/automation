package com.flex.automation.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flex.automation.entity.TicketDetails;
import com.flex.automation.repository.TicketDetailsRepository;
import com.flex.automation.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

    private static final Logger logger = LoggerFactory.getLogger(TicketServiceImpl.class);

    @Autowired
    TicketDetailsRepository ticketDetailsRepository;

    @Override
    public void saveDetails(List<TicketDetails> ticketDetails) {

        for (TicketDetails ticketDetailsInput : ticketDetails) {

            // Get existing records in DB
            List<TicketDetails> ticketDetailsDB = ticketDetailsRepository
                    .findIdByTicketNumberAndFlexPartNumberAndCustomerNameAndManufacturerAndMpn(
                            ticketDetailsInput.getTicketNumber(), ticketDetailsInput.getFlexPartNumber(),
                            ticketDetailsInput.getCustomerName(), ticketDetailsInput.getManufacturer(),
                            ticketDetailsInput.getMpn());

            for (TicketDetails detailsDB : ticketDetailsDB) {

                detailsDB.setPartStatus(ticketDetailsInput.getPartStatus());
                detailsDB.setRemarks(ticketDetailsInput.getRemarks());
                ticketDetailsRepository.save(detailsDB);
            }
        }
        logger.info("Saved");

    }

}
