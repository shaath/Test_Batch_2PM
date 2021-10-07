package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBankLaunchTest {

	public static void main(String[] args) {
		
		String expval= "Primus BANK";
		
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://primusbank.qedgetech.com/");
		
		String actval = driver.getTitle();
		if (expval.equalsIgnoreCase(actval)) 
		{
			System.out.println("Primusbank home page launched successfully");
		}
		else
		{
			System.out.println("Primusbank home page not displayed");
		}
	}

}
