package Excel;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        String fileLocation = "C:\\Projects\\TestNg\\src\\main\\java\\Excel\\Login.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook(fileLocation);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowVal = sheet.getPhysicalNumberOfRows();
        int cellVal = sheet.getRow(0).getLastCellNum();
        System.out.println("rowval " + rowVal);
        System.out.println("cell " + cellVal);


        //System.out.println(cell.getStringCellValue());
        for(int i=1;i<rowVal;i++) {
            XSSFRow row = sheet.getRow(i);
            for(int j=0;j<cellVal;j++) {
                XSSFCell cell = row.getCell(j);
                DataFormatter dft = new DataFormatter();
                String valofCell= dft.formatCellValue(cell);
                System.out.println(valofCell);
            }
        }
    }
}
