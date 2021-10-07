package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");	
		
		WebElement dropdown = driver.findElement(By.id("drlist"));
		
		Select s =new Select(dropdown);
		
//		s.selectByIndex(5);
//		Thread.sleep(5000);
//		s.selectByValue("Srnagar");
//		Thread.sleep(5000);
//		s.selectByVisibleText("warangal");
		
		List<WebElement> dlist = s.getOptions();
		System.out.println(dlist.size());
		
		for (int i = 0; i < dlist.size(); i++) 
		{
			s.selectByIndex(i);
			String cname = dlist.get(i).getText();
			System.out.println(cname);
		}
		

	}

}
