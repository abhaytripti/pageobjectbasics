package com.automation.pages;



import com.automation.base.Page;

public class LoginPage extends Page {
// void is replaced by next opening page class	
public ZohoAppPage doLogin(String username, String password) {
	
	type("email_CSS",username);
	submit("nextbtn_XPATH");
	type("password_CSS",password);
	submit("signbtn_XPATH");
	return new ZohoAppPage();
}
}