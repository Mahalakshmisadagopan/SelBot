package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC001_CreateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_CreateLead";
		testcaseDec = "Login, Create Lead/Edit/Merge and Verify";
		author = "Maha";
		category = "smoke";
		excelFileName = "TC001";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String uName, String pwd, String companyName, String firstName, String lastName,String email,String title) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergelead()
		.cFromlead()
		.fromLead()
		.toLead();		
		/*.clickFindlead()
		.clickEmail()
		.enterEmail(email)
		.clickfindlead()
		.clickfirstres()
		.printbfcompany()
		.updcompany(companyName)
		.clickCreate();*/
		/*.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLead()
		.verifyCompanyName(companyName);*/
	}
	
}






