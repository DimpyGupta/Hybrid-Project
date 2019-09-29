package dataacess;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead {

	public static String[][] ReadExcel(){
		// TODO Auto-generated method stub

		String[][] data= null;
		try
		{
			FileInputStream fs= new FileInputStream("C:\\Users\\Administrator\\Desktop\\New folder\\Testcase.xls");
			HSSFWorkbook book= new HSSFWorkbook(fs);
			HSSFSheet sheet= book.getSheet("LoginDetail");
			int rn,cn;
			rn= sheet.getPhysicalNumberOfRows();
			cn= sheet.getRow(rn).getPhysicalNumberOfCells();
			data= new String[rn-1][cn-1];
			for(int i=1;i<rn;i++)
			{
				HSSFRow row= sheet.getRow(i);
				HSSFCell cel1= row.getCell(1);
				HSSFCell cel2= row.getCell(2);
				data[i-1][0]= cel1.getStringCellValue();
				data[i-1][1]= cel2.getStringCellValue();
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		return data;
	}

}
