package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Factory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	//page factory//
	public MergeLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement fromLeadlookup;

	public FindLeadPage clickFromLeadlookup() {

		click(fromLeadlookup);
		return new FindLeadPage();

	}


	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement toLeadlookup;

	public FindLeadPage clickToLeadlookup() {

		click(toLeadlookup);
		return new FindLeadPage();

	}

	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement mergeLeadbtn;

	public ViewLead clickMergeLeadBtn() {
		click(mergeLeadbtn);
		return new ViewLead();
	}
	
	public MergeLeadPage verifyMergeLeadTitlePage(String data) {
		verifyTitle(data);
		return this;
	}


}
