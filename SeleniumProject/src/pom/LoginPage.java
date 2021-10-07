package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public static String url = "http://orangehrm.qedgetech.com";
	public static String u = "Admin", p = "Qedge123!@#";
		
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement login;

	public void orgLogin(String u, String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
	
}
