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

public class DuplicateLeadPage extends ProjectMethods{
	//page factory//
	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}

	
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement eleCreateLeadbtn;

	public ViewLead clickCreateLeadbtn() {
		click(eleCreateLeadbtn);
		return new ViewLead();

	}

	public DuplicateLeadPage verifyDuplicateLeadTitlePage(String data) {
		//verifyTitle(data);
		return this;
	}


}



