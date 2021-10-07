package day1;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaucnhEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch_2PM\\Jar\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
	}

}
