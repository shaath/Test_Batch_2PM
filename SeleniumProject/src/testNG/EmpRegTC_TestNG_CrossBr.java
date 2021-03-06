package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import methods.OrgHRM_Master;

public class EmpRegTC_TestNG_CrossBr{
	@Parameters({"Br", "eid"})
	@Test
	public void org_EmpReg(String br, String eid) throws InterruptedException, IOException
	{
		System.out.println(br+"---"+eid);
		OrgHRM_Master om = new OrgHRM_Master();
		om.org_Launch(br, om.url);
		Thread.sleep(5000);
		om.org_Login(om.u, om.p);
		Thread.sleep(5000);
		om.org_EmpReg("Shushma", "Ch", eid);
		Thread.sleep(5000);
		om.org_Logout();
		Thread.sleep(5000);
		om.org_Close();
	}
	
}
