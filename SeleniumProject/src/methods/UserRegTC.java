package methods;

import java.io.IOException;

public class UserRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		OrgHRM_Master om = new OrgHRM_Master();
		
		res = om.org_Launch("firefox", om.url);
		System.out.println("Application launch "+res);
		
		res = om.org_Login(om.u, om.p);
		System.out.println("Application login "+res);
		
		res = om.org_UserReg("AutoTest Testing", "AutoTestTesting123", "SampleTest!9876543210@");
		System.out.println("User Registration "+res);
		
		res = om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");

	}

}
