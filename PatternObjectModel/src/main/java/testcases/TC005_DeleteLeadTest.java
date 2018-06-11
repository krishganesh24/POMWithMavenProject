package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLeadTest extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete lead functionality in Leaftaps";
		testNodes="Leads Taps";
		category="Sanity";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC005 _DeleteLead";
	}
	@Test(dataProvider="fetchData")
	public void deleteLeadTest(String uname,String pwd,String leadid,String title,String msg) throws InterruptedException {

		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogIn().
		clickCRMFSAlink().
		clickLeadsLink().
		clickFindLead().enterLeadid(leadid).
		clickFindLeadsBtn().
		clickFirstRow().
		verifyViewLeadTitlePage(title).
		clickDeleteButton().
		clickFindLead().
		enterLeadid(leadid).
		clickFindLeadsBtn().
		verifyErrorMsg(msg);



	}



}
