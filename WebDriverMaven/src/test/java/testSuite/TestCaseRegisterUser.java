package testSuite;

import org.testng.annotations.Test;

import com.fb.DataHandler.LandingPageDataHandler;
import com.fb.DataRepository.LandingPageData;
import com.fb.GenericReusable.Browser;
import com.fb.PageObjects.LandingPage;

public class TestCaseRegisterUser extends Browser{
	
	LandingPage lPage;
	LandingPageData lPageData;
	String rowName;
	
	public TestCaseRegisterUser() {
		rowName="TestCaseRegisterUser";
		lPageData=LandingPageDataHandler.get(rowName);
	}
	@Test
	public void TestRegister(){
		Step01ProvideFirstNameAndBday();
		Step02ClickOnSignUP();
	}


private void Step02ClickOnSignUP() {
		// TODO Auto-generated method stub
		
	}


private void Step01ProvideFirstNameAndBday(){
	lPage=new LandingPage(driver);
	lPage.Register(lPageData.getFirstName(), "Lal", "30");
	
	}

	
	
	
	

}
