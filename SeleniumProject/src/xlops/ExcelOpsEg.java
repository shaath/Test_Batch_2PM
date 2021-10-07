package xlops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.OrgHRM_Master;

public class ExcelOpsEg {

	public static void main(String[] args) throws IOException, InterruptedException {
		String res = null;
		String xlPath = "D:\\Testing_Batch_2PM\\Workspace/SeleniumProject\\src\\testdata\\TestData.xlsx";
		String xlOut = "D:\\Testing_Batch_2PM\\Workspace\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(2);
//		XSSFCell c = r.getCell(2);
		
//		System.out.println(c.getStringCellValue());
		
		int Rc = ws.getLastRowNum();
		System.out.println(Rc);
		
		OrgHRM_Master om = new OrgHRM_Master();
		om.org_Launch("firefox", "http://orangehrm.qedgetech.com");
		om.org_Login(om.u, om.p);
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r = ws.getRow(i);
			XSSFCell c1 = r.getCell(0);
			XSSFCell c2 = r.getCell(1);
			XSSFCell c3 = r.getCell(2);
			
			XSSFCell c4 = r.createCell(3);
			
			String f = c1.getStringCellValue();
			String l = c2.getStringCellValue();
			String eid = c3.getStringCellValue();
			
			System.out.println(f +"---"+ l +"---"+ eid);
			
			res = om.org_EmpReg(f, l, eid);
			
			c4.setCellValue(res);
			
		}
		
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
				
	}

}
