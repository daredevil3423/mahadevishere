package genericUtility;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String fetchDataFromExcel(String sheetName,int rowNo,int cellNo)
	FileInputStream fis = new FileInputStream("");
	 Workbook workbook = WorkbookFactory.create(fis);
	
    return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
}
}