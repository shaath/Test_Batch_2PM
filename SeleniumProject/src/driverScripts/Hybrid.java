package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.OrgHRM_Master;

public class Hybrid {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String xl_Path = "D:\\Testing_Batch_2PM\\Workspace\\SeleniumProject\\src\\testdata\\Hybrid.xlsx";
		String xl_out = "D:\\Testing_Batch_2PM\\Workspace\\SeleniumProject\\src\\results\\Hybrid_Res.xlsx";
		
		String res = null;
		
		OrgHRM_Master om = new OrgHRM_Master();
		
		FileInputStream fi = new FileInputStream(xl_Path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet TC_Sht = wb.getSheet("Testcase");
		XSSFSheet TS_Sht = wb.getSheet("Teststeps");
		XSSFSheet TD_Sht = wb.getSheet("TestData");
		XSSFSheet Emp_Sht = wb.getSheet("EmpReg");
		
		int TC_Rc = TC_Sht.getLastRowNum();
		int TS_Rc = TS_Sht.getLastRowNum();
		int Emp_Rc = Emp_Sht.getLastRowNum();
		
		for (int i = 1; i <= TC_Rc; i++)
		{
			TC_Sht.getRow(i).createCell(3);
			String exe = TC_Sht.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String TC_Id = TC_Sht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_Rc; j++)
				{
					String TS_TC_Id = TS_Sht.getRow(j).getCell(0).getStringCellValue();
					
					if (TC_Id.equalsIgnoreCase(TS_TC_Id))
					{
						String key = TS_Sht.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							String br = TD_Sht.getRow(1).getCell(0).getStringCellValue();
							String url = TD_Sht.getRow(1).getCell(1).getStringCellValue();
							res = om.org_Launch(br, url);
							break;
						case "login":
							String u = TD_Sht.getRow(1).getCell(2).getStringCellValue();
							String p = TD_Sht.getRow(1).getCell(3).getStringCellValue();
							res = om.org_Login(u, p);
							break;
						case "logout":
							res = om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= Emp_Rc; k++) {
								String f = Emp_Sht.getRow(k).getCell(0).getStringCellValue();
								String l = Emp_Sht.getRow(k).getCell(1).getStringCellValue();
								String eid = Emp_Sht.getRow(k).getCell(2).getStringCellValue();
								res = om.org_EmpReg(f, l, eid);
								
								Emp_Sht.getRow(k).createCell(3).setCellValue(res);
							}
							break;
						case "Usereg":	
							String ename = TD_Sht.getRow(1).getCell(7).getStringCellValue();
							String uname = TD_Sht.getRow(1).getCell(8).getStringCellValue();
							String pwd = TD_Sht.getRow(1).getCell(9).getStringCellValue();
							res = om.org_UserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = TD_Sht.getRow(1).getCell(8).getStringCellValue();
							String pswd = TD_Sht.getRow(1).getCell(9).getStringCellValue();
							res = om.org_Login(un, pswd);
							break;
						default:
							System.out.println("Select a proper Keyword");
							break;
						}
						// For updating results in Test steps sheet
						TS_Sht.getRow(j).createCell(4).setCellValue(res);
						
						//For Updating the results in Test case sheet
						if(!TC_Sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							TC_Sht.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				TC_Sht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xl_out);
		
		wb.write(fo);
		wb.close();
		
	}

}
