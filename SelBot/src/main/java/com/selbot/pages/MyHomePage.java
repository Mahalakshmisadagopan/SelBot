package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class MyHomePage extends Annotations{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Leads")  WebElement eleLeads;
	@FindBy(how=How.LINK_TEXT,using="Find Leads") WebElement eleFindlead;
	@FindBy(how=How.XPATH,using="//a[text()='Merge Leads']") WebElement eleMergelead;
	

	public MyHomePage clickLeads() {
		click(eleLeads);
		return this;
	}

	public FindDLead clickFindlead()
	{
		click(eleFindlead);
		return new FindDLead();
	}
	public MergePage clickMergelead()
	{
		
		click(eleMergelead);
		return new MergePage();
	}

}
