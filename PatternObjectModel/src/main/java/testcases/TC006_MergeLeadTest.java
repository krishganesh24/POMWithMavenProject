package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import pages.MergeLeadPage;
import pages.MyLeadsPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLeadTest extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_MergeLead";
		testDescription="Delete lead functionality in Leaftaps";
		testNodes="Leads Taps";
		category="Sanity";
		authors="Ganesh";
		browserName="chrome";
		dataSheetName="TC006 _MergeLead";
	}
	@Test(dataProvider="fetchData")
	public void mergeLeadTest(String uname,String pwd,String fromleadid,String toleadid,String title,String msg) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogIn().
		clickCRMFSAlink().
		clickLeadsLink().
		clickMergeLead().clickFromLeadlookup().switchToWindow(1);
		new FindLeadPage().enterLeadid(fromleadid).clickFindLeadsBtn().clickFirstRow().switchToWindow(0);
		//Thread.sleep(3000);
		new MergeLeadPage().clickToLeadlookup().switchToWindow(1);
		new FindLeadPage().enterLeadid(toleadid).clickFindLeadsBtn().clickFirstRow().switchToWindow(0);
		new MergeLeadPage().verifyMergeLeadTitlePage(title).clickMergeLeadBtn().acceptAlert();
		new MyLeadsPage().clickFindLead().enterLeadid(fromleadid).clickFindLeadsBtn().verifyErrorMsg(msg);
			
					
	}

	
	
}
