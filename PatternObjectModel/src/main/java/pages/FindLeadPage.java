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

public class FindLeadPage extends ProjectMethods{
	//page factory//
	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//label[contains(text(),'Lead ID:')]/following::input")
	private WebElement Leadid;
	
	public FindLeadPage enterLeadid(String data) {
		type(Leadid,data);
		return this;
		
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement enterFindFname;

	public FindLeadPage findFirstName(String data) {
		type(enterFindFname, data);
		return this;

	}

	@FindBy(how=How.NAME,using="lastName")
	private WebElement enterFindLname;

	public FindLeadPage findLastName(String data) {
		type(enterFindLname, data);
		return this;

	}
	@FindBy(how=How.NAME,using="companyName")
	private WebElement enterFindCompname;

	public FindLeadPage findCompanyName(String data) {
		type(enterFindCompname, data);
		return this;
	}

// ********************Phone no Field locator*********************************************************//
			
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Phone')]")
	private WebElement Phonetab;
	
	public FindLeadPage clickPhoneNumTab() {
		click(Phonetab);
		return this;
	}
	
	
	
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneNum;

	public FindLeadPage enterPhoneNumber(String data) {
		type(elePhoneNum, data);
		return this;
	}
	
	
	// ********************Phone no Field locator*********************************************************//
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement findLeadBtn;
	
	public FindLeadPage clickFindLeadsBtn() {
	click(findLeadBtn);
	return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement EleFirstList;
	
	public ViewLead clickFirstRow() {
	click(EleFirstList);
	return new ViewLead();
	}
	
	public  FindLeadPage getTextofFirstrow() {
		String txt1= getText(EleFirstList);
		return this;
		
	}
	
	public  FindLeadPage enterFirstRowValue() {
		type(EleFirstList, getText(EleFirstList));
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement errorMsgField;
	

public FindLeadPage verifyErrorMsg(String data) {
	verifyExactText(errorMsgField, data);
	return this;
	
}

}



