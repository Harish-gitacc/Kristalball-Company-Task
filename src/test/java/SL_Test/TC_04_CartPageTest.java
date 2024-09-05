package SL_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseFile;
import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductPage;

public class TC_04_CartPageTest extends BaseFile {
	@BeforeTest
	public void setup() {
		testName = "TC_03_ChekoutTest";
		testDescription = "Check Wheter the Cart page is working or not";
		testCategory = "Functional";
		testAuthor = "Harish ";
		
	}
	@Test
    public void TC_03_ChekoutTest() throws Exception{
		 LoginPage login= new LoginPage(driver);
	 		login.EnterDetails("standard_user","secret_sauce");
	    	Thread.sleep(2000);
	    	
	    	 ProductPage productPage = new ProductPage(driver);
	    	 productPage.addBackpackToCart();
	    	 productPage.addBikeLightToCart();
	    	 productPage.clickOnCartButton();
	    	 
	    	 CartPage cartpage =new CartPage();
	    	 cartpage.clickOnCheckoutButton();
	    	 cartpage.inputFirstname("Hari");
	    	 cartpage.inputLastname("VJ");
	    	 cartpage.inputPostalCode("0045");
	    	 cartpage.clickOnContinueButton();
	    	 scrollToElement(cartpage.finishButton);
	    	 cartpage.clickOnFinishButton();
	}
}
