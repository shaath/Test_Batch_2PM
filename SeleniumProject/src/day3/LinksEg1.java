package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) {
		int count = 0;
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lName = links.get(i).getText();
			if (!lName.equals(""))
			{
				System.out.println(lName);
				count++;
			}
			
		}
		System.out.println("The visible links count "+count);
	}

}
