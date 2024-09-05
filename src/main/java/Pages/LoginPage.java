package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseFile;

public class LoginPage extends BaseFile {
	@FindBy(id = "user-name")
	WebElement Login;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement LoginButton;

	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterDetails(String Username, String Password) throws Exception {
		enter(Login, Username);
		enter(password, Password);
		clickOn(LoginButton);
		String expectedTitle ="Single ";
		if (driver.getTitle().startsWith(expectedTitle)) {
			System.out.println("title is validated");
			screenShot(getPageTitle());
			
		} else {
			System.out.println("title is not validated");
			screenShot(getPageTitle());
		}
		

	}
}
