package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableEg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch_2PM\\Jar\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://orangehrm.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));

		username.sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			
			String f = cols.get(2).getText();
			System.out.println(f);
		}
		
	}
}
