package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class HomePage extends BaseClass {

	
	


	@FindBy(xpath="//img[@id=\"logo\"]")
	WebElement logo;

	@FindBy(xpath="//button[@id=\"headerfblogin\"]")
	WebElement studentaccess;

	@FindBy(xpath="//a[@id=\"wblhead\"]")
	WebElement wbl;

	@FindBy(xpath="//a[@id=\"loginButton\"]")
	WebElement loginbtn;

	//creating a constructor

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public boolean Checklogo() {
		return logo.isDisplayed();

	}

	public boolean Checkstudentaccess() {
		return studentaccess.isDisplayed();
	}

	public boolean CheckWbl() {
		return wbl.isDisplayed();
	}

	public LoginPage checkLogin() {
		loginbtn.click();
		return new LoginPage(driver);
	}

}



