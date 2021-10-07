package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethodsEg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		Thread.sleep(5000);
		driver.navigate().to("http://facebook.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
