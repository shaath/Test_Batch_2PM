package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_OpsEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("SampleTest");
		email.click();
		Thread.sleep(5000);
//		email.sendKeys(Keys.CONTROL);
//		email.sendKeys("A");
//		Thread.sleep(5000);
//		
//		email.sendKeys(Keys.CONTROL);
//		email.sendKeys("C");
//		Thread.sleep(5000);
//		email.click();
//		Thread.sleep(5000);
//		email.sendKeys(Keys.CONTROL);
//		email.sendKeys("V");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		email.click();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
