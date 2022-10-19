package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(xpath="//input[@id=\"username\"]")
	WebElement uname;

	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement pword;

	@FindBy(xpath="//button[@id=\"login\"]")
	WebElement login;


	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Checkusername(String un) {
		uname.sendKeys(un);

	}

	public void Checkpassword(String pwd) {
		pword.sendKeys(pwd);
	}

	public void clicklogin() {
		login.click();
	}

 public LandingPage checkSigin() {
	 uname.sendKeys(super.user);
	 pword.sendKeys(super.pass);

	 login.click();
	 return new LandingPage(driver);
 }



}



