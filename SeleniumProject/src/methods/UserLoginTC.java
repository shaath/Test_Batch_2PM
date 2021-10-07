package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res = null;
		OrgHRM_Master om = new OrgHRM_Master();
		
		res = om.org_Launch("firefox", om.url);
		System.out.println("Application launch "+res);
		
		res = om.org_Login("AutoTestTesting123", "SampleTest!9876543210@");
		System.out.println("Application login "+res);
		
		res = om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");

	}

}
