package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseFile;

public class CheckoutPage extends BaseFile {
    

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backpackAddButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeBackpack;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	public WebElement bikeLightAddButton;
	    
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	public WebElement onesieButton;
		
	@FindBy(id = "shopping_cart_container")
	public WebElement cartButton;
		
    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastName;

    @FindBy(id = "postal-code")
    public WebElement postalCode;

    @FindBy(id = "continue")
    public WebElement continuneButton;
    
    @FindBy(id = "finish")
    public WebElement finishButton;

    @FindBy(css = ".error-message-container.error")
    public WebElement errorMessage;

    
    public CheckoutPage(WebDriver driver){
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
    public void addOnesieToCart(){
        onesieButton.click();
    }    
    public void clickOnCartButton(){
        cartButton.click();
    }     
    public void inputFirstName(String name){
        firstName.clear();
        firstName.sendKeys(name);
    }
    public void inputLastname(String LastName){
        lastName.clear();
        lastName.sendKeys(LastName);
    }
    public void inputPostalCode(String postal){
        postalCode.clear();
        postalCode.sendKeys(postal);
    }
    public void clickOnContinueButton(){
        continuneButton.click();
    }    
    public void clickOnFinishButton(){
        finishButton.click();
    }
}
