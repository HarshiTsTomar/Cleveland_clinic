package utils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
import java.io.IOException;
 
public class ExcelReader {
    public static FileInputStream file = null;
    public static XSSFWorkbook workbook = null;
    public static String cellValue = null;
 
   
/**
     * Author: Md Saif Masoom
     * Reads the value of a cell from an Excel sheet.
     * This method reads the value of a cell from the specified sheet, identified by the key and column name.
     * It opens the Excel file, locates the sheet, and retrieves the cell value based on the provided key and column name.
     *
     * @param sheetName  The name of the sheet to read from.
     * @param key        The key to identify the row.
     * @param columnName The name of the column to read the value from.
     * @return The value of the cell as a String.
     */


    public static String readCellValue(String sheetName, String key, String columnName) {
        String filePath = System.getProperty("user.dir") + "/testdata/data.xlsx";
 
        try {
            file = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow headerRow = sheet.getRow(0);
            int keyColumnIndex = -1;
            int targetColumnIndex = -1;
 
            for (Cell cell : headerRow) {
                String cellValueHeader = cell.getStringCellValue().trim();
                if (cellValueHeader.equalsIgnoreCase("id")) {
                    keyColumnIndex = cell.getColumnIndex();
                }
                if (cellValueHeader.equalsIgnoreCase(columnName)) {
                    targetColumnIndex = cell.getColumnIndex();
                }
                if (keyColumnIndex != -1 && targetColumnIndex != -1) {
                    break;
                }
            }
 
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                if (row != null) {
                    Cell keyCell = row.getCell(keyColumnIndex);
                    if (keyCell != null && keyCell.getStringCellValue().trim().equalsIgnoreCase(key)) {
                        Cell targetCell = row.getCell(targetColumnIndex);
                        if (targetCell != null) {
                            cellValue = targetCell.toString();
                            break;
                        }
                    }
                }
            }
 
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error with data: " + e.getMessage());
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
        return cellValue;
    }
}