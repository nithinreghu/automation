package com.flex.automation.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);

    private FileUtil() {
        // Default
    }

    public static List<List<String>> readExcel(String filename) throws IOException {

        List<List<String>> rowList = new ArrayList<>();
        try {
            List<String> columnList = new ArrayList<>();

            Workbook workbook = WorkbookFactory.create(new File(filename));
            Sheet sheet = workbook.getSheetAt(0);

            // Create a DataFormatter to format and get each cell's value as String
            DataFormatter dataFormatter = new DataFormatter();
            sheet.forEach(row -> {
                row.forEach(cell -> {
                    String cellValue = dataFormatter.formatCellValue(cell);
                    columnList.add(cellValue);
                });
                rowList.add(columnList);
            });
            workbook.close();

        } catch (IOException e) {
            logger.error("Couldnt read the file..{}", e.getMessage());
            throw e;
        }
        return rowList;

    }

}
