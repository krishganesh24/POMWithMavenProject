package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLeadTest extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit lead functionality in Leaftaps";
		testNodes="Leads Taps";
		category="Sanity";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC004_EditLead";
	}
	@Test(dataProvider="fetchData")
	public void editLeadTest(String uname,String pwd,String fName,String indname) throws InterruptedException {
		
		new LoginPage().
		enterUserName(uname).
		enterPassword(pwd).
		clickLogIn().
		clickCRMFSAlink().
		clickLeadsLink().
		clickFindLead().
		findFirstName(fName).
		clickFindLeadsBtn().
		clickFirstRow().
		clickEditButtton1().
		selectIndustryDropdown(indname).
		clickUpdateBtn().
		verifyIndsutryName(indname);
					
	}

	
	
}
