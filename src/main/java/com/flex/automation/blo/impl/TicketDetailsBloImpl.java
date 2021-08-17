package com.flex.automation.blo.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flex.automation.blo.TicketDetailBlo;
import com.flex.automation.configuration.TicketConfiguration;
import com.flex.automation.entity.TicketDetails;
import com.flex.automation.service.TicketService;
import com.flex.automation.util.FileUtil;
import com.flex.automation.util.ValidationUtil;

@Component
public class TicketDetailsBloImpl implements TicketDetailBlo {

    @Autowired
    private TicketConfiguration ticketConfiguration;

    @Autowired
    private TicketService ticketService;

    @Override
    public void saveDetails() throws IOException {

        List<List<String>> excelContents = FileUtil.readExcel("C://Hashna/FileName.xlsx");

        if (ValidationUtil.isValidExcelHeaders(excelContents, 5)) {

            List<TicketDetails> ticketDetails = ValidationUtil.populateExcelDataToDTO(excelContents);

            ticketService.saveDetails(ticketDetails);

        }

    }

}
