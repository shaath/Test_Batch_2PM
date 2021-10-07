package day6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobuttonEg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://echoecho.com/htmlforms10.htm");		
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		WebElement radio_group = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		
		List<WebElement> radios = radio_group.findElements(By.tagName("input"));
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String data = radios.get(i).getAttribute("value");
			System.out.println(data);
			
			if(data.equalsIgnoreCase("milk"))
			{
				radios.get(i).click();
//				System.out.println(radios.get(i).isSelected());
			}
			else if (data.equalsIgnoreCase("water"))
			{
				radios.get(i).click();
//				System.out.println(radios.get(i).isSelected());
			}
			
		}

	}

}
