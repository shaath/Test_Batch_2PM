package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridEg1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
//		DesiredCapabilities cap = DesiredCapabilities.firefox();
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.ANY);
		
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.7:4444/wd/hub"), cap);
		
		driver.get("http://orangehrm.qedgetech.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
//		username.click();
//		Thread.sleep(5000);
		username.sendKeys("Admin");
//		Thread.sleep(5000);
//		username.clear();
		
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
		
//		driver.close();
		driver.quit();
		
	}

}
