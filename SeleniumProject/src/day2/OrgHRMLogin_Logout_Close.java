package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgHRMLogin_Logout_Close {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Batch_2PM\\Jar/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch_2PM\\Jar\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://orangehrm.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
//		username.click();
//		Thread.sleep(5000);
		username.sendKeys("Admin");
//		Thread.sleep(5000);
//		username.clear();
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		
//		driver.close();
		driver.quit();
	}

}
