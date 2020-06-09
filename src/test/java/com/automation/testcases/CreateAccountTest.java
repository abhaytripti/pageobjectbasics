package com.automation.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.base.Page;
import com.automation.pages.ZohoAppPage;
import com.automation.pages.crm.accounts.AccountsPage;
import com.automation.pages.crm.accounts.CreateAccountPage;
import com.automation.utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass = Utilities.class,dataProvider = "dp")
	public void createAccountTest(Hashtable<String,String> data) {
			ZohoAppPage zp =new ZohoAppPage();
			zp.gotoCRM();
	       AccountsPage account=Page.menu.gotoAccounts();
	       CreateAccountPage cap = account.gotoCreateAccounts();
	       cap.createAccount(data.get("accountname"));
	       Assert.fail("Create account test failed");
	}
}