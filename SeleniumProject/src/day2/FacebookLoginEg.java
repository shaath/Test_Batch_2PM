package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginEg {

	public static void main(String[] args) {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("gande3@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();

	}

}
