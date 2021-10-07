package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableEg {

	public static void main(String[] args) {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frame_eg = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame_eg);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(drag, 400, 234).perform();
		
	}

}
