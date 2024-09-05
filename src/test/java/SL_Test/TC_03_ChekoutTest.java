package SL_Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseFile;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.ProductPage;

public class TC_03_ChekoutTest extends BaseFile {

	@BeforeTest
	public void setup() {
		testName = "TC_03_ChekoutTest";
		testDescription = "Check Wheter the Checkout page is working or not";
		testCategory = "Functional";
		testAuthor = "Harish ";
		
	}
	 @Test
	    public void TC_03_ChekoutTest() throws Exception{
		    LoginPage login= new LoginPage(driver);
	 		login.EnterDetails("standard_user","secret_sauce");
	    	Thread.sleep(2000);
	    	
	        ProductPage productPage = new ProductPage(driver);
			productPage.addOnesieToCart();
			productPage.clickOnCartButton();
			productPage.clickOnCheckoutButton();
			
	        CheckoutPage checkoutPage = new CheckoutPage(driver);
			checkoutPage.inputFirstName("Hari");
	        checkoutPage.inputLastname("VJ");
	        checkoutPage.inputPostalCode("0045");
	        checkoutPage.clickOnContinueButton();
	        
	       
	    }
}
