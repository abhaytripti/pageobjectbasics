package com.automation.pages;

import org.openqa.selenium.By;


import com.automation.base.Page;
import com.automation.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {
	/* remove the constructor because it used from page class
	WebDriver driver;
	
	public ZohoAppPage(WebDriver driver) {
		this.driver=driver;	
	}*/

	public void gotoBooks() {}
	
	
	
	
	public CRMHomePage gotoCRM() {
	click("crmlink_CSS");
	return new CRMHomePage();	
	}
	
	
	
	
	public void gotoInvoice() {
		driver.findElement(By.cssSelector("._logo-invoice._logo-x96.zod-app-logo")).click();
	}
	
	
	
	
	
	
	
	
}
