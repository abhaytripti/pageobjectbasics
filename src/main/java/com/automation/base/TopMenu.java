package com.automation.base;



import com.automation.pages.crm.accounts.AccountsPage;

public class TopMenu {

	
	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() {
		Page.click("accountstab_CSS");
		return new AccountsPage();
	
	}

	public void gotoDeals() {

	}

	public void signOut() {

	}

}
