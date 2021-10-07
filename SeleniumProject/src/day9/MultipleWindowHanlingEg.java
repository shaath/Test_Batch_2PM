package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHanlingEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
//		String gmail_wid = driver.getWindowHandle();
//		System.out.println(gmail_wid);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> wid = driver.getWindowHandles();
		
		Iterator<String> it = wid.iterator();
		
		while(it.hasNext())
		{
			String wid_data = it.next();
			System.out.println(wid_data);
			
			driver.switchTo().window(wid_data);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			
			try
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			}
			catch(Exception e)
			{
				System.out.println("The exepected link is not available in "+driver.getTitle()+" window");
			}
			
		}
	
	}

}
