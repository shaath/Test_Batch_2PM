package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRM_Master extends GenricMethods{

	public static String url = "http://orangehrm.qedgetech.com";
	public static String u = "Admin", p = "Qedge123!@#";
//	public static WebDriver driver;
	public static String expval, actval;
	public GenricMethods gm;
	public FileInputStream fi;
	public Properties pr;
	public static String prop_path = "D:\\Testing_Batch_2PM\\Workspace\\SeleniumProject\\src\\properties\\OrgHRM.properties";
	//Launch
	public String org_Launch(String br, String url) throws IOException
	{
		expval = "LOGIN";
//		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
//		driver = new FirefoxDriver();
		gm = new GenricMethods();
		gm.invoke_Browser(br);
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		fi = new FileInputStream(prop_path);
		pr = new Properties();
		pr.load(fi);
		
		actval = driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Login
	public String org_Login(String u, String p) throws InterruptedException
	{
		expval = "welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		Thread.sleep(5000);
		
		actval = driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Logout
	
	public String org_Logout() throws InterruptedException
	{
		Thread.sleep(3000);
		expval = "LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval = driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
		
	}
	
	//Close
	
	public void org_Close()
	{
		driver.close();
	}
	
	//Employee Registration
	
	public String org_EmpReg(String f, String l, String eid)
	{
		expval = f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval = driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		if (expval.equalsIgnoreCase(actval))
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//User Registration
	
	public String org_UserReg(String ename, String uname, String pwd) throws InterruptedException
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
		
		if (flag == true)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
}
