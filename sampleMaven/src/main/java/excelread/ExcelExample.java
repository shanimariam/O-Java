package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	//read string data
	public static String readStringData(int row,int col)throws IOException
	{
		f=new FileInputStream("/Users//sachinvmathew//Desktop//Mark.xlsx");
				w=new XSSFWorkbook(f);
				sh=w.getSheet("Sheet1");
				XSSFRow r=sh.getRow(row);
				XSSFCell c=r.getCell(col);
				return c.getStringCellValue();
				
			}
//read integer data
			public static String readIntegerData(int row, int col)throws IOException
			{
				f=new FileInputStream("/Users//sachinvmathew//Desktop//Mark.xlsx");
				w=new XSSFWorkbook(f);
				sh=w.getSheet("Sheet1"); //getsheet is method
				XSSFRow r=sh.getRow(row);
				XSSFCell c=r.getCell(col);
				int val=(int)c.getNumericCellValue(); //typecasteing becuase getnumberic returns double value
				return String.valueOf(val); //return val 
				
			}

		}

