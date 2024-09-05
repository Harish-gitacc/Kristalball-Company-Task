package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BaseFile;

public class ProductPage extends BaseFile {
   
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backpackAddButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement bikeLightAddButton;

    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removeBikeLight;

    @FindBy(id = "shopping_cart_container")
    public WebElement cartButton;

    @FindBy(className = "product_sort_container")
    public WebElement sortDropDown;

    @FindBy(className = "shopping_cart_badge")
    public static WebElement numberOfProductsInCart;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement onesieButton;

    @FindBy(id = "remove-sauce-labs-onesie")
    public WebElement removeOnesie;

    @FindBy(className = "inventory_item")
    public List<WebElement> inventoryList;

    @FindBy(xpath = "//a[normalize-space()='Facebook']")
    public WebElement FacebookIcon;

    @FindBy(xpath = "//a[normalize-space()='LinkedIn']")
    public  WebElement linkedIn;
    
    @FindBy(className = "bm-burger-button")
    public WebElement hiddenMenuButton;
    
//    @FindBy(xpath="//button[@id='react-burger-cross-btn']")
//    public WebElement CloseHiddenMenu;

    @FindBy(css = ".bm-item.menu-item")
    public List<WebElement> hiddenMenuItems;

    @FindBy(id = "inventory_sidebar_link")
    public WebElement allItems;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logOutButton;
     
    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    
    public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    
    public void addBackpackToCart(){
        backpackAddButton.click();
    }
    public void removeBackpackFromCart(){
        removeBackpack.click();
    }
    public void addBikeLightToCart(){
        bikeLightAddButton.click();
    }
    public void removeBikeLightFromCart(){
        removeBikeLight.click();
    }
    public static int numberOfProductsInCart(){
        String number =  numberOfProductsInCart.getText();
        return Integer.parseInt(number);
    }
    public void addOnesieToCart(){
        onesieButton.click();
    }
    public void removeOnesieFromCart(){
        removeOnesie.click();
    }
    public void selectDropdown(String choice){
        Select select = new Select(sortDropDown);
        select.selectByVisibleText(choice);
    }
    public String getFirstInventoryFromList(){
        return inventoryList.get(0).getText();
    }
    public void clickOnCartButton(){
        cartButton.click();
    }
    public void clickOnFacebookIcon(){
    	FacebookIcon.click();
    }
    
  /*  public void clickOnCloseButton() {
    	CloseHiddenMenu.click();
    }*/
    public  void clickOnLinkedInIcon(){
        linkedIn.click();
    }    
    public void clickOnHiddenMenu(){
        hiddenMenuButton.click();
    }
    public void clickOnLogOutButton(){
        logOutButton.click();
    }
	public void clickOnCheckoutButton(){
        checkoutButton.click();
    }
}
