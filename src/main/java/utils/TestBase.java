package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static String path = System.getProperty("user.dir");
	
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream(new File(path+"\\src\\main\\java\\Com\\qa\\config\\Config.properties"));
			prop.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void initialization(){
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", path+"\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		} 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIEMOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLECIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	public void  teardown(){
		driver.quit();
	}

}
