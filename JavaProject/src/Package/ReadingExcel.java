package Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    File src=new File("G:\\smita salenium\\Consultancy details.xlsx");
    FileInputStream fis=new FileInputStream(src);
    FileOutputStream fos=new FileOutputStream(src);
   /// XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFWorkbook wbo=new XSSFWorkbook("G:\\smita salenium\\Consultancy details.xlsx");
   // XSSFSheet sh=wb.getSheet("Details1");
    
   // XSSFWorkbook workbook = new XSSFWorkbook();
   // XSSFSheet sheet = workbook.createSheet("Java Books");
    XSSFSheet sh1=wbo.createSheet("Timepass");
    
 /*   XSSFRow row=sh.getRow(3);
    System.out.println(sh.getSheetName());
    System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
    System.out.println(sh.getRow(3).getCell(2).getStringCellValue());
    System.out.println(sh.getRow(3).getLastCellNum());
    System.out.println(sh.getRow(3).getFirstCellNum());
    System.out.println(sh.getPhysicalNumberOfRows());
    int lastrow=sh.getPhysicalNumberOfRows();
    
    
    Row r=sh.createRow(7);
    Cell c=r.createCell(0);
    c.setCellValue("hello");
    System.out.println("successful");*/
    
    
    
  
	}

}
