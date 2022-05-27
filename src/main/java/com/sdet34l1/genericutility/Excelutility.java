package com.sdet34l1.genericutility;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * 
 * @author Admin
 *
 */
public class Excelutility
{
	static Workbook wb;
	public static void openExcel(String filepath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		wb = WorkbookFactory.create(fis);

	}
	/**
	 * 
	 * 
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 */
	public static String getDataFromExcel( String sheetName , int rowNumber,int cellNumber)
	{
		String data=wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		return data;
	}
	public static void  setDataFromExcel(String sheetName , int rowNumber ,int cellNumber, String message)
	{
		wb.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(message);
	}
	/**
	 * 
	 * 
	 * @param savefilepath
	 */

	public static void saveExcel(String savefilepath)
	{
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(savefilepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param closefilepath
	 */
	public static void closeExcel()
	{
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

public static Object[][] getMultipleDataFromExcel(String SheetName){
	Sheet sh = wb.getSheet(SheetName);
	
Object[][] arr=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
for(int i=1;i<sh.getLastRowNum();i++)
{
for(int j=0; j<sh.getRow(i).getLastCellNum();j++)
{
	arr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();

}
}
return arr;
}
}
