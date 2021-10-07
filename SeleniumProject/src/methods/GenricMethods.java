package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenricMethods 
{
	public static WebDriver driver;
	public void invoke_Browser(String br)
	{
		if (br.equalsIgnoreCase("Firefox")) 
		{
			System.setProperty("wedriver.gecko.driver", "D:\\Testing_Batch_2PM\\Jar\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Testing_Batch_2PM\\Jar/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Testing_Batch_2PM\\Jar\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch_2PM\\Jar\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
	}

}
