package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/sitemap.html");

//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
		
//		WebElement block = driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
//														
//		List<WebElement> links = block.findElements(By.tagName("a"));
//		
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++) 
//		{
//			String lName = links.get(i).getText();
//			System.out.println(lName);
//			if (lName.equalsIgnoreCase("Home")) 
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();
	}

}
