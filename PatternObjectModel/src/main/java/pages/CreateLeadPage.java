 package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompanyname;
	
	public CreateLeadPage enterCompanyName(String data) {
		type(elecompanyname, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstname;
	
	public CreateLeadPage enterFirstName(String data) {
		type(eleFirstname, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastname;
	
	public CreateLeadPage enterLastname(String data) {
		type(eleLastname,data);
		return this;		
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadbtn;
	
	public ViewLead clickCreateLeadbutton() {
	
		click(eleCreateLeadbtn);
		return new ViewLead();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
