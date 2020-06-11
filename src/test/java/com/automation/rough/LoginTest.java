package com.automation.rough;


import com.automation.base.Page;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.ZohoAppPage;

import com.automation.pages.crm.accounts.AccountsPage;
import com.automation.pages.crm.accounts.CreateAccountPage;



public class LoginTest {
	// this is my rough pakage

	public static void main(String[] args) {
		//no driver reference command this test class
        // Its to perform login
        //removed straight forward object and implement page Object
        // as soon as we will create instance HomePage class it will call page class because it extends page class
	   HomePage home = new HomePage();
       LoginPage lp = home.goToLogin();
       ZohoAppPage zp = lp.doLogin("artlover.harshita@gmail.com","tripti75");
       zp.gotoCRM();
       AccountsPage account=Page.menu.gotoAccounts();
       CreateAccountPage cap = account.gotoCreateAccounts();
       cap.createAccount("Tripti");
       
       /*List <WebElement> framesList = driver.findElements(By.xpath("//iframe"));
       int numOfFrames = framesList.size();
       System.out.println(numOfFrames );*/
        //home.goToSignUp();
        //home.goToSupport();
	}

}
