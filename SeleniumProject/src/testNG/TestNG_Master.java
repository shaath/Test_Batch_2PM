package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import methods.GenricMethods;

public class TestNG_Master extends GenricMethods{
	public static String url = "http://orangehrm.qedgetech.com";
	public static String u = "Admin", p = "Qedge123!@#";
//	public static WebDriver driver;
	public static String expval, actval;
	public GenricMethods gm;
	public FileInputStream fi;
	public Properties pr;
	public static String prop_path = "D:\\Testing_Batch_2PM\\Workspace\\SeleniumProject\\src\\properties\\OrgHRM.properties";
	public static String br = "Firefox";
	public static String f = "SampleTest22", l = "SampleAutoTest22", eid = "ATSAT7681";
	public static String ename = f+" "+l, uname = "AA"+f+l+"23795", pwd = "SampleTest@0987654321@";
	
	@BeforeTest
	public void org_Launch() throws IOException
	{
		expval = "LOGIN";
		gm = new GenricMethods();
		gm.invoke_Browser(br);
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		fi = new FileInputStream(prop_path);
		pr = new Properties();
		pr.load(fi);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeClass
	public void org_login() throws InterruptedException
	{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		Thread.sleep(5000);
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterClass
	public void org_Logout() throws InterruptedException
	{
		Thread.sleep(3000);
		expval = "LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterTest
	public void org_Close()
	{
		driver.close();
	}
}
