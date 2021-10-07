package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreeshotEg {

	public static void main(String[] args) throws IOException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://google.com");	
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Testing_Batch_2PM\\Workspace\\SeleniumProject\\src\\screenshots\\google.png"));
		
	}

}
