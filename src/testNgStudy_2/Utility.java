package testNgStudy_2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	//excel
	 //screenshot
	//close
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("C:\\Software testing\\Selenium\\1_velocity.xlsx");
	 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value; 
	}

}
