package day9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowhandlingEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
		driver.findElement(By.linkText("Privacy")).click();
		Set<String> wid = driver.getWindowHandles();
		
		for (String data : wid) 
		{
			System.out.println(data);
			driver.switchTo().window(data);
			Thread.sleep(5000);
			if (driver.getTitle().contains("Privacy Policy")) 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			}			
		}
	}

}
