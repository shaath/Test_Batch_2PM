package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/sitemap.html");		
		
		WebElement block = driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
														
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lName = links.get(i).getText();
			System.out.println(lName);
			
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\Testing_Batch_2PM\\Workspace\\SeleniumProject\\src\\screenshots\\"+lName+".jpg"));
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			block = driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
			links = block.findElements(By.tagName("a"));
		}

	}

}
