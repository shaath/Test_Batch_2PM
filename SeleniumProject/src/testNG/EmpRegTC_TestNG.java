package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpRegTC_TestNG extends TestNG_Master{

	@Test(dataProvider="data")
	public void org_EmpReg(String f, String l, String eid)
	{
		System.out.println(f+"---"+l+"---"+eid);
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Ram";
		data[0][1] = "Charan";
		data[0][2] = "RM87654";
		
		data[1][0] = "Sai";
		data[1][1] = "Krishna";
		data[1][2] = "SK7645";
		
		return data;
	}
}
