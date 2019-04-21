package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindDLead extends Annotations{

	public FindDLead()
	{
		PageFactory.initElements(driver, this);
	}

	//driver.findElementByXPath("//span[text()='Email']").click();
	//driver.findElementByXPath("//label[text()='Email Address:']/following::input").sendKeys("xyz@gmail.com");
	//driver.findElementByXPath("//button[text()='Find Leads']").click();
	//WebElement element2 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	//driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	@FindBy(how=How.XPATH,using="//span[text()='Email']") 
	WebElement eleEmail;
	@FindBy(how=How.XPATH,using="//label[text()='Email Address:']/following::input")
	WebElement eleeemail;
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement elefindlead;
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement elefirstlead;
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	WebElement eleclickdup;
	public FindDLead clickEmail()
	{
		click(eleEmail);
		return this;
	}

	public FindDLead enterEmail(String email)
	{
		clearAndType(eleeemail,email);
		return this;
	}
	public FindDLead clickfindlead()
	{
		click(elefindlead);
		return this;
	}
	public DuplicatePage clickfirstres()
	{
		click(elefirstlead);
		click(eleclickdup);
		return new DuplicatePage();
	}
	

}
