package com.flex.automation.util;

import java.util.ArrayList;
import java.util.List;

import com.flex.automation.entity.TicketDetails;

public class ValidationUtil {

    private ValidationUtil() {
        // Default
    }

    public static boolean isValidExcelHeaders(List<List<String>> excelContents, int columnNumber) {
        return (null != excelContents && !excelContents.isEmpty() && null != excelContents.get(0)
                && !excelContents.get(0).isEmpty() && excelContents.get(0).size() == columnNumber);
    }

    public static List<TicketDetails> populateExcelDataToDTO(List<List<String>> excelContents) {

        // Removing headers
        excelContents.remove(0);
        List<TicketDetails> ticketDetailsList = new ArrayList<>();

        for (List<String> rows : excelContents) {

            TicketDetails ticketDetails = new TicketDetails();

            ticketDetails.setTicketNumber(rows.get(0));
            ticketDetails.setCustomerName(rows.get(1));
            ticketDetails.setStartDate(rows.get(2));
            ticketDetails.setTargetDate(rows.get(3));
            ticketDetails.setRequester(rows.get(4));
            ticketDetails.setSite(rows.get(5));
            ticketDetails.setTickerStatus(rows.get(6));
            ticketDetails.setRequirement(rows.get(7));
            ticketDetails.setFlexPartNumber(rows.get(8));
            ticketDetails.setDescription(rows.get(9));
            ticketDetails.setManufacturer(rows.get(10));
            ticketDetails.setMcode(rows.get(11));
            ticketDetails.setMpn(rows.get(12));
            ticketDetails.setPartStatus(rows.get(13));
            ticketDetails.setRemarks(rows.get(14));
            ticketDetails.setEmailAddress(rows.get(14));
            ticketDetails.setPhoneNumber(rows.get(15));

            ticketDetailsList.add(ticketDetails);
        }

        return ticketDetailsList;
    }

}
