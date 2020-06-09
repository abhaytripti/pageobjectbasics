package com.automation.pages;

import org.openqa.selenium.By;


import com.automation.base.Page;
//In POM all the functionality on one page will be written under one class using methods 

//if we change method type from void to next page which is opening then we do not have to create Object of that class in LoginTest class
public class HomePage extends Page{
		
	public void goToSupport(){
	
	driver.findElement(By.cssSelector("a[class='zh-support']")).click();		
	}

	public void goToSignUp() {
	driver.findElement(By.cssSelector("a[class='zh-signup']")).click();	
	}
	
	public LoginPage goToLogin() {
		click("loginlink_CSS");
	return new LoginPage();	
	
	}
	
	public void goToZohoEdu() {
		
	}
	public void goToLearnMore() {
		
	}
	public void validateFooterLink() {
		
		
	}
}
