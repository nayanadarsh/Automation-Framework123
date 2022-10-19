package BasePackage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityPackage.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	

public static WebDriver driver;


ReadConfig readConfig=new ReadConfig();
Properties prop=readConfig.LoadConfig();

String url=readConfig.getURL(prop);
protected String user=readConfig.getusername(prop);
protected String pass=readConfig.getpassword(prop);




public void intialization() {

	WebDriverManager.chromedriver().setup();

	 driver=new ChromeDriver();
	 driver.get("prop.getProperty(/Users/nayanadarsh/eclipse-workspace/TestFramework/src/main/java/ConfigPackage/Config.properties");

	 driver.manage().window().maximize();
}
	
}
