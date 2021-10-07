package day11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.id("photofile"));
		element.sendKeys("D:\\2.png");
		
//		JavascriptExecutor exe = (JavascriptExecutor)driver;
//		exe.executeScript("arguments[0].click();", element);
//		
//		Thread.sleep(3000);
//		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop/FileUpload.exe");
	}

}
