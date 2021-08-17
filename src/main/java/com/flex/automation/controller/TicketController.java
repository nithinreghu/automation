package com.flex.automation.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flex.automation.blo.TicketDetailBlo;

@RestController
public class TicketController {
    
    @Autowired
    TicketDetailBlo ticketDetailBlo;

    @GetMapping("/hello")
    public String hello() throws IOException {
        ticketDetailBlo.saveDetails();
        return "Hello";
    }

}
