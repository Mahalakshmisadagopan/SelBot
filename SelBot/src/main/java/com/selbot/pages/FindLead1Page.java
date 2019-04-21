package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindLead1Page extends Annotations {
	String Fromlead;
	String ToLead;
	public FindLead1Page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//div[@unselectable='on'])[16]")
	WebElement elecemail;
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")
	WebElement elefirstlead;
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[7]")
	WebElement elesecondlead;
	
	////input[@name='id']
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement elefrom;
	@FindBy(how=How.XPATH,using="//a[@href[contains(.,'LookupLeads')]])[2]")
	WebElement eleTolead;
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	WebElement elemerge;
	
	public FindLead1Page fromLead()
	{
		
	click(elecemail);
	click(elecemail);
	//To check how to pass that title
	//switchToWindow(title);
	String Fromlead = elefirstlead.getText();
	System.out.println("Text  of from lead " + Fromlead);
	click(elefirstlead);
	elefrom.sendKeys(Fromlead);
	switchToWindow(0);
	return this;
	}
	public FindLead1Page toLead()
	{
		
	click(eleTolead);
	//switchToWindow(title);
	switchToWindow(1);
	//switchToWindow(title);
	click(elecemail);
	click(elecemail);
	String ToLead = elefirstlead.getText();
	System.out.println("Text  of To lead " + ToLead);
	click(elesecondlead);
	eleTolead.sendKeys(ToLead);
	switchToWindow(0);
	click(elemerge);
	acceptAlert();
	System.out.println("Merge completed successfully for from Lead  id "+Fromlead);
	System.out.println("Merge completed successfully for to Lead  id "+ToLead);
	return this;
	}
	

}
