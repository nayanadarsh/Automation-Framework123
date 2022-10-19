package TestPackage;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LoginPage;

public class HomePageTest extends BaseClass{

	HomePage hp;
	LoginPage lp;

	//create a constructor

	public HomePageTest() {
		super();
	}


	@BeforeMethod
	public void setup() {

		intialization();
		 hp=new HomePage(driver);
	}

	@AfterMethod
	public void teardown() {
		driver.close();

	}

	@Test(priority=1)
	public void testlogo() {
		boolean logo=hp.Checklogo();
		Assert.assertTrue(logo);
	}

	@Test(priority=2)
	public void teststudentaccess() {
		boolean student =hp.Checkstudentaccess();
		Assert.assertTrue(student);
	}

	@Test(priority=3)
	public void testwbl() {
		boolean wb=hp.CheckWbl();
		Assert.assertTrue(wb);
	}
	@Test(priority=4)
	public void testlogin() {
		lp=hp.checkLogin();
	}
	
	
}
