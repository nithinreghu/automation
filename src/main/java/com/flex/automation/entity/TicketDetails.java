package com.flex.automation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket_Details")
public class TicketDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "TICKET_NUMBER")
    private String ticketNumber;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "START_DATE")
    private String startDate;

    @Column(name = "TARGET_DATE")
    private String targetDate;

    @Column(name = "FLEX_PART_NUMBER")
    private String flexPartNumber;

    @Column(name = "REQUESTER")
    private String requester;

    @Column(name = "REQUIREMENT")
    private String requirement;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SITE")
    private String site;

    @Column(name = "MANUFACTURER")
    private String manufacturer;

    @Column(name = "MPN")
    private String mpn;

    @Column(name = "MCODE")
    private String mcode;

    @Column(name = "TICKET_STATUS")
    private String ticketStatus;

    @Column(name = "PART_STATUS")
    private String partStatus;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    public TicketDetails() {
        super();
    }

    public TicketDetails(String ticketNumber, String customerName, String flexPartNumber, String site,
            String manufacturer, String mpn) {
        super();
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.flexPartNumber = flexPartNumber;
        this.site = site;
        this.manufacturer = manufacturer;
        this.mpn = mpn;
    }

    public TicketDetails(String manufacturer, String mpn) {
        super();
        this.manufacturer = manufacturer;
        this.mpn = mpn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public String getFlexPartNumber() {
        return flexPartNumber;
    }

    public void setFlexPartNumber(String flexPartNumber) {
        this.flexPartNumber = flexPartNumber;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    public String getTickerStatus() {
        return ticketStatus;
    }

    public void setTickerStatus(String tickerStatus) {
        this.ticketStatus = tickerStatus;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getPartStatus() {
        return partStatus;
    }

    public void setPartStatus(String partStatus) {
        this.partStatus = partStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
