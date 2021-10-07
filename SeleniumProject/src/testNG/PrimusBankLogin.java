package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBankLogin {

	FirefoxDriver driver;
	@BeforeMethod
	public void primus_Launch() throws InterruptedException
	{
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
	}
	
	@Test
	public void primus_Login() throws InterruptedException
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void primus_Logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void primus_close()
	{
		driver.close();
	}
}
