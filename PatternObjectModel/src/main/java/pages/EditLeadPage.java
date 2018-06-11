package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	//page factory//
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_industryEnumId")
	private WebElement eleIndustryDropdown;

	public EditLeadPage selectIndustryDropdown(String data) {
		selectDropDownUsingText(eleIndustryDropdown, data);
		return this;

	}

	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleUpdateBtn;
	
	public ViewLead clickUpdateBtn() {
	click(eleUpdateBtn);
	return new ViewLead();
	}
	
	
	
	
	










}



