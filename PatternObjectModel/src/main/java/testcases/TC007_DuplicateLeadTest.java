package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLeadTest extends ProjectMethods {


	@BeforeTest
	public void setData() {

		testCaseName="TC007_DuplicateLead";
		testDescription="Duplicate lead functionality in Leaftaps";
		testNodes="Leads Taps";
		category="Sanity";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC007_DuplicateLead";

	}

	@Test(dataProvider="fetchData")
	public void duplicateLeadTest(String uname,String pwd,String phone,String title) throws InterruptedException
	{

		new LoginPage().enterUserName(uname).
		enterPassword(pwd).
		clickLogIn().
		clickCRMFSAlink().
		clickLeadsLink().
		clickFindLead().
		clickPhoneNumTab().
		enterPhoneNumber(phone).
		clickFindLeadsBtn().
		clickFirstRow().
		clickDuplicateButton().
		verifyDuplicateLeadTitlePage(title).
		clickCreateLeadbtn();
	}

}
