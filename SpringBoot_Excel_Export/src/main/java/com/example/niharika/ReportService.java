package com.example.niharika;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;


@Service
public class ReportService {
	
	@Autowired
	private CustomerRepository custRepo;
	
	public void generateExcel(HttpServletResponse response) throws IOException {
		
		List<Customer> customers = custRepo.findAll();
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Customers Info");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("CustomerId");
		row.createCell(1).setCellValue("CustomerName");
		row.createCell(2).setCellValue("CustomerLocation");
		row.createCell(3).setCellValue("CustomerEmail");
		row.createCell(4).setCellValue("ContactNo");
		int dataRowIndex  =1;
		for(Customer cust: customers) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(cust.getCustomerId());
			dataRow.createCell(1).setCellValue(cust.getName());
			dataRow.createCell(2).setCellValue(cust.getLocation());
			dataRow.createCell(3).setCellValue(cust.getEmail());
			dataRow.createCell(4).setCellValue(cust.getContactNo());
			dataRowIndex++;
		}
		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();	
	}

}
