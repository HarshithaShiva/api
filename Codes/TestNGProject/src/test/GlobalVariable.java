package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlobalVariable {
	
	public WebDriver driver = null;
	
	@Test
	public void login() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Qualitest\\eclipse-workspace\\TestNGProject\\src\\test\\datadriver.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		if(prop.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(prop.get("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
		
			
		}
		else {
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}

}
