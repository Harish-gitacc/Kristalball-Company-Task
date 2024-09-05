package SL_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseFile;
import Pages.LoginPage;


public class TC_01_Login extends BaseFile{
	@BeforeTest
	public void setup() {
		testName = "TC_01_Login";
		testDescription = "Login to Swag Labs website ";
		testCategory = "Functional";
		testAuthor = "Harish ";
		
	}
	@Test(dataProvider = "getFromExcel",priority = 1)
	public void TC_01_Login(String Username, String Password) throws Exception {
		LoginPage login= new LoginPage(driver);
		login.EnterDetails(Username, Password);
	}
	

}
