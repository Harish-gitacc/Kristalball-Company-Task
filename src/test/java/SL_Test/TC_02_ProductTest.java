package SL_Test;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseFile;
import Pages.LoginPage;
import Pages.ProductPage;

public class TC_02_ProductTest extends BaseFile {

	@BeforeTest
	public void setup() {
		testName = "TC_02_ProductTest";
		testDescription = "Order products from Swag Labs website ";
		testCategory = "Functional";
		testAuthor = "Harish ";
		
	}
     @Test
     public void TC_02_ProductTest() throws Exception
     {
    	 
    	 LoginPage login= new LoginPage(driver);
 		login.EnterDetails("standard_user","secret_sauce");
    	 Thread.sleep(2000);
    	 
    	ProductPage product = new ProductPage(driver); 
    	product.addBackpackToCart();
    	Assert.assertEquals(ProductPage.numberOfProductsInCart(), 1);
    	product.addOnesieToCart();
        Assert.assertEquals(ProductPage.numberOfProductsInCart(), 2);
        
        String firstItem = product.getFirstInventoryFromList();
        product.selectDropdown("Name (Z to A)");
        String secondItem = product.getFirstInventoryFromList();
        Assert.assertFalse(firstItem.equalsIgnoreCase(secondItem));
        
        ProductPage productPage = new ProductPage(driver);
		productPage.clickOnFacebookIcon();
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        String actualURL = driver.switchTo().window(tabs.get(1)).getCurrentUrl();
        Assert.assertEquals(actualURL, "https://www.facebook.com/saucelabs");
      //  driver.switchTo().window(actualURL);
        
      }  
     }
