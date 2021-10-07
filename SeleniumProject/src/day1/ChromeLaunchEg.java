package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Batch_2PM\\Jar/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");

	}

}
