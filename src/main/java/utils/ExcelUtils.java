package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcelUtils {
    private Workbook workbook;

    public ExcelUtils(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getColumnData(String sheetName, int columnIndex) {
        List<String> data = new ArrayList<>();
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet != null) {
            for (Row row : sheet) {
                Cell cell = row.getCell(columnIndex);
                if (cell != null) {
                    data.add(cell.getStringCellValue().trim());
                }
            }
        }
        return data;
    }

    public String getRandomName(String sheetName, int columnIndex) {
        List<String> names = getColumnData(sheetName, columnIndex);
        names.remove(0); // Remove the "Name" header
        Random random = new Random();
        return names.get(random.nextInt(names.size()));
    }

    public void closeWorkbook() {
        try {
            if (workbook != null) {
                workbook.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
