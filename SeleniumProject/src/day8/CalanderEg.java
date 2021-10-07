package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException {
		
		String date = "17-Sept-2022";
		
		String[] split = date.split("-");
		String exp_day = split[0];
		String exp_mon = split[1];
		String exp_year = split[2];
		System.out.println(exp_day+"---"+exp_mon+"---"+exp_year);
		
		boolean flag = false;
		System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch_2PM\\Jar\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//section[@id='search']/div/div[3]")).click();
		Thread.sleep(3000);
		
		String act_mon_year = driver.findElement(By.className("monthTitle")).getText();		
		String exp_m_y = exp_mon+" "+exp_year;
		
		while(!act_mon_year.equalsIgnoreCase(exp_m_y))
		{
			driver.findElement(By.className("next")).click();
			act_mon_year = driver.findElement(By.className("monthTitle")).getText();
		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		
		for (int i = 2; i < rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < cols.size(); j++) {
				String act_day = cols.get(j).getText();
				System.out.println(act_day);
				if (act_day.equals(exp_day))
				{
					cols.get(j).click();
					flag = true;
					break;
				}
			}
			if (flag == true)
			{
				break;
			}
		}
		
	}

}
