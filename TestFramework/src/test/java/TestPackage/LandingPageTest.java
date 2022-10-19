package TestPackage;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;

public class LandingPageTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	LandingPage land;


	public LandingPageTest() {
	super();

	}
	@BeforeMethod
	public void setup() {
		intialization();
		hp= new HomePage(driver);
		lp=new LoginPage(driver);
		land =new LandingPage(driver);	


		lp=hp.checkLogin();// check the login by clicking on login btn(we will be returing to loginpage)
		land=lp.checkSigin();// enter username and password(returning to landing page)
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}


	@Test
	public void Testlogo() {

		boolean logo=land.checklogo();
		Assert.assertTrue(logo);
	}


}

