package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class MergePage extends Annotations {
	
	public MergePage()
	{
		PageFactory.initElements(driver, this);
	}
  	//driver.findElementByXPath("(//a[@href[contains(.,'LookupLeads')]])[1]").click();
	@FindBy(how=How.XPATH,using="(//a[@href[contains(.,'LookupLeads')]])[1]")
	WebElement elefromlead;

	public FindLead1Page cFromlead()
	{
		
		click(elefromlead);
		switchToWindow(1);
		return new FindLead1Page();
		//click(elecemail);
		//click(elecemail);
	}
}
