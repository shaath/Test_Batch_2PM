package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegTC_TestNG extends TestNG_Master {

	@Test
	public void org_userReg() throws InterruptedException
	{
		boolean flag = false;
		expval = uname;
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			actval = cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval)) 
			{
				flag = true;
				break;
			}
		}
		
		Assert.assertEquals(flag, true);
	}
}
