package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	


	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleViewFname;

	public ViewLead verifyFirstname(String data) {
		click(eleViewFname);
		return this;
	}



	public ViewLead verifyViewLeadTitlePage(String data) {
		verifyTitle(data);
		return this;
	}

	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
	private WebElement editLeadBtn;

	public EditLeadPage clickEditButtton1() {
		click(editLeadBtn);
		return new EditLeadPage();
	}

	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement deleteBtn;

	public MyLeadsPage clickDeleteButton() {
		click(deleteBtn);
		return new MyLeadsPage();
	}

	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement duplicateBtn;

	public DuplicateLeadPage clickDuplicateButton() {
		click(duplicateBtn);
		return new DuplicateLeadPage();
	}

	


	@FindBy(how=How.ID,using="viewLead_industryEnumId_sp")
	private WebElement viewIndustryName;

	public ViewLead verifyIndsutryName(String data) {
		verifyExactText(viewIndustryName, data);
		return new ViewLead();
	}









}
