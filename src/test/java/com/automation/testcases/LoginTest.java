package com.automation.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.ZohoAppPage;
import com.automation.utilities.Utilities;

public class LoginTest extends BaseTest{

	@Test(dataProviderClass = Utilities.class,dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data) {
		HomePage home = new HomePage();
	       LoginPage lp = home.goToLogin();
	       ZohoAppPage zp = lp.doLogin(data.get("username"),data.get("password"));	
	Assert.fail("Login test failed");
	
	}
	
	
	
	
}
