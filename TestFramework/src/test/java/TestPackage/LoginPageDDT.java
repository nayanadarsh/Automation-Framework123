package TestPackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import UtilityPackage.ReadXL;


public class LoginPageDDT extends BaseClass {
	
	
	HomePage hp;
	LoginPage lp;
	LandingPage landpage;

	//create a constructor

	public LoginPageDDT() {
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
	public void teardown() {
		driver.close();

	}
		

	
	@Test(dataProvider="logindata")
	public void ddt(String user,String pwd) throws InterruptedException {
		
		lp.Checkusername(user);
		lp.Checkpassword(pwd);
		lp.clicklogin();
		landpage=new LandingPage(driver);
		
		
	
	}	
		
	@DataProvider(name="logindata")
	String[][]getdata() throws IOException{
		
		String Path="/Users/nayanadarsh/eclipse-workspace/TestFramework/src/test/resources/logindata.xlsx";
		int rownum=ReadXL.getRowCount(Path, "Sheet1",1);	
		int colcount=ReadXL.getCellCount(Path, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j]=ReadXL.getCellData(Path, "Sheet1", i, j);
			}
		}
		
		
		
		return logindata;
		
	}
	
		
}
