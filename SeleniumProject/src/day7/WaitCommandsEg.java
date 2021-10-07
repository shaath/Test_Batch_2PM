package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommandsEg {

	public static void main(String[] args) {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 360);
		
		driver.get("https://www.24hourfitness.com/");	
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='owl-item']//a[text()=' Join Now ']")));
	
		driver.findElement(By.xpath("//div[@class='owl-item']//a[text()=' Join Now ']")).click();

	
	}

}
