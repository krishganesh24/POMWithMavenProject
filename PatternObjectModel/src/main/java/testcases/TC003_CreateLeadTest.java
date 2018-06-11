package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeadTest extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLeadTest";
		testDescription="Create lead functionality in Leaftaps";
		testNodes="Leads Taps";
		category="Sanity";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
	}
	@Test(dataProvider="fetchData")
	public void createLeadTest(String uName,String pwd,String cName,String fName,String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn().
		clickCRMFSAlink().
		clickLeadsLink().
		clickCreateLead().
		enterCompanyName(cName).enterFirstName(fName).enterLastname(lName).clickCreateLeadbutton().
		verifyFirstname(fName);
		
		
					
	}

	
	
}
