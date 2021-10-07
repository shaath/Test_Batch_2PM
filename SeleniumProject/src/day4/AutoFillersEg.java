package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("H");
		Thread.sleep(5000);
		
		List<WebElement> cities = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++)
		{
			String cName = cities.get(i).getText();
			System.out.println(cName);
			
			if (cName.equalsIgnoreCase("Haridwar")) 
			{
				cities.get(i).click();
				break;
			}
		}
		
	}

}
