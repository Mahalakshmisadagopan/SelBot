package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class DuplicatePage extends Annotations{
	String Company;
	public DuplicatePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//input[@id='createLeadForm_companyName']")
	WebElement elecompany;
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	WebElement elevcompany;
	//	driver.findElementByXPath("//input[@value='Create Lead']").click();
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	WebElement eleclickcreate;
	public DuplicatePage printbfcompany()
	{
		Company= getTypedText(elecompany);
		System.out.println("Company before print "+Company);
		return this;
	}
	
	public DuplicatePage updcompany(String company)
	{
		clearAndType(elecompany,company);
		return this;
	}
	public DuplicatePage clickCreate()
	{
		click(eleclickcreate);
		Company= getElementText(elevcompany);
		System.out.println("Company after print "+Company);
		System.out.println("Duplicate lead created successfully");
		return this;
	}

}
