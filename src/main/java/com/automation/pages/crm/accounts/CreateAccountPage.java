package com.automation.pages.crm.accounts;


import com.automation.base.Page;

public class CreateAccountPage extends Page {
	
public void createAccount(String accountName) {
	
	type("accountname_CSS",accountName);
}	

}
