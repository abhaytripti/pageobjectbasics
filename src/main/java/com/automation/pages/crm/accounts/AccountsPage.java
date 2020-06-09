package com.automation.pages.crm.accounts;

import org.openqa.selenium.By;

import com.automation.base.Page;

public class AccountsPage extends Page {
	
	
public CreateAccountPage gotoCreateAccounts() {
	
	click("createaccountbtn_XPATH");
	return new CreateAccountPage();
}	
	
public void gotoImportAccounts() {
	driver.findElement(By.cssSelector("#importButton")).click();
	
}
}
