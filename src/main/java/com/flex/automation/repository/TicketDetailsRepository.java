package com.flex.automation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flex.automation.entity.TicketDetails;

@Repository
public interface TicketDetailsRepository extends JpaRepository<TicketDetails, Integer> {

    List<TicketDetails> findIdByTicketNumberAndFlexPartNumberAndCustomerNameAndManufacturerAndMpn(String ticketNumber,
            String flexPartNumber, String customerName, String manufacturer, String mpn);

}
