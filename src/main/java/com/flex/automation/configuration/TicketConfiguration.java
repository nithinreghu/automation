package com.flex.automation.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "ticket")
public class TicketConfiguration {

    private String filename;
    private int fileColumns;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFileColumns() {
        return fileColumns;
    }

    public void setFileColumns(int fileColumns) {
        this.fileColumns = fileColumns;
    }

}
