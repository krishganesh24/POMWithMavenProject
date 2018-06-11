package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
		
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreteLead;
	
	public CreateLeadPage clickCreateLead() {
		click(eleCreteLead);
		return new CreateLeadPage();
	}
	

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	
	public FindLeadPage clickFindLead() {
			click(eleFindLead);
		return new FindLeadPage();
	}
	
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLead;
	
	public MergeLeadPage clickMergeLead() {
			click(eleMergeLead);
		return new MergeLeadPage();
	}
}
