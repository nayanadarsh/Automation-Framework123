package TestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;

public class LoginPageTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	LandingPage land;


	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		intialization();

		hp=new HomePage(driver);
		lp=new LoginPage(driver);

		lp=hp.checkLogin();

	}
@AfterMethod
public void Teardown() {
	driver.close();
}
@Test
public void checksigin() {
	land=lp.checkSigin();

}

}




