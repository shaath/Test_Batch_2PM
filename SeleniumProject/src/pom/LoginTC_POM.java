package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import methods.GenricMethods;

public class LoginTC_POM extends GenricMethods{

	public static void main(String[] args) throws InterruptedException {
		
		GenricMethods gm = new GenricMethods();
		gm.invoke_Browser("Firefox");
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get(lp.url);
		lp.orgLogin(lp.u, lp.p);
		
		Thread.sleep(5000);
		
		AdminhomePage ap = PageFactory.initElements(driver, AdminhomePage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		
	}

}
