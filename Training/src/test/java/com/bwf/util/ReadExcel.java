package com.bwf.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * ReadExcel绫讳娇鐢≒OI-XSSF瀹炵幇2007鐗堟湰浠ュ悗excel鏂囦欢涓寚瀹歋heet椤垫暟鎹殑璇诲彇
 * @author liudao
 *
 */
public class ReadExcel {
	/**
	 * getDataFromExcel静态方法用于读取在resource目录下的xlsx文件指定页的数据，第一行数据作为头信息，自动跳过
	 * @param excelFileName 在resource目录下的xlsx文件名，不需要指定路径
	 * @param sheetName 所需读取的数据所在的sheet页名称
	 * @return 将数据作为二维数组返回
	 */
	public static Object[][] getDataFromExcel(String excelFileName,String sheetName){
		Object[][] obj=null;
		InputStream url = ReadExcel.class.getClassLoader().getResourceAsStream(excelFileName);
		Workbook wb=null;
		Sheet sheet=null;
		try {
			wb = new XSSFWorkbook(url);
			sheet = wb.getSheet(sheetName);
			int lastRowNum = sheet.getLastRowNum();
			Short lastCellNum = sheet.getRow(lastRowNum).getLastCellNum();
			obj = new Object[lastRowNum][lastCellNum];
			for(int i=0;i<=lastRowNum;i++) {
				for(int j=0;j<lastCellNum;j++) {
					if(i!=0) {
						String str = sheet.getRow(i).getCell(j).getStringCellValue();
						if(str.equalsIgnoreCase("<Empty>")) {
							obj[i-1][j]="";
						}else {
							obj[i-1][j]=str;
						}
					};
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				wb.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return obj;
	}
}
