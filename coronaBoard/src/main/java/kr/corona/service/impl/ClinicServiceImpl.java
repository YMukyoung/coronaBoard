package kr.corona.service.impl;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import kr.corona.service.ClinicService;

@Service
public class ClinicServiceImpl implements ClinicService{
	
	@SuppressWarnings("resource")
	@Override
	public List<String> getClinicLoc() {
		List<String> address = new ArrayList<>();
		try {
//			FileInputStream file = new FileInputStream("C:/Users/User/Downloads/coronaBoard.xlsx");
			FileInputStream file = new FileInputStream("src/main/resources/file/coronaBoard.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			int rowNo = 0;
			int cellIndex = 4;
			
			XSSFSheet sheet = workbook.getSheetAt(0);

			int rows = sheet.getPhysicalNumberOfRows();
			for(rowNo = 1; rowNo < rows; rowNo++) {
				XSSFRow row = sheet.getRow(rowNo);
				if(row != null) {
					XSSFCell cell = row.getCell(cellIndex);
					if(cell != null) {
						address.add(cell.getStringCellValue());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return address;
	}
}
