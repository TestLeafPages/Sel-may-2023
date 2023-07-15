package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	// convert the method into normal method
	public static String[][] readData(String fileName,String shName) throws IOException {
		// TODO Auto-generated method stub

		// Set the path the file
		XSSFWorkbook book = new XSSFWorkbook("./data/"+fileName+".xlsx");
		// Identify the sheet -->index starts with zero
		//XSSFSheet sheet = book.getSheetAt(1);
		XSSFSheet sheet = book.getSheet(shName);
		// book.getSheet("CreateLead");-->sheetname
		// count of rows including headers
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		int rowCount = sheet.getLastRowNum();// rows occupied with data excludes row 1 in excel
		// by default it is treated as header -->get the count from the second row
		System.out.println(rowCount); // 2 -->1 to 2
		int colCount = sheet.getRow(1).getLastCellNum();
		System.out.println(colCount);// 4 ->0 to 3

		// to integrate with testcase
		String[][] data = new String[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				// getRow(0)-->read from header
				// System.out.println(stringCellValue2);
				data[i - 1][j] = stringCellValue;// -->1-1,0 -->0,0
				// 0,0 -->TL
				// 0,1-->Vidya
			}

		}
		book.close(); // manadatory step
		return data;

	}

}

// book-->sheet-->row-->col

// identify the row -->index starts with zero
/*
 * XSSFRow row = sheet.getRow(1);
 * 
 * //read data from each cell of first col XSSFCell cell = row.getCell(2);
 * //-->(1,0) -->TL row 2 first column -->aA@
 * 
 * //to print the value from the cell String stringCellValue =
 * cell.getStringCellValue(); System.out.println(stringCellValue);
 */
// book-->sheet-->row-->cell-->value
