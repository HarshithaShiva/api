import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://login.yahoo.com/account/create?.intl=us&.lang=en-US&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
		//driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click();
		//driver.findElement(By.xpath("//option[contains(text(),'March ')]")).click();
		/*Select s = new Select(driver.findElement(By.xpath("//select[@id='usernamereg-month']")));
		s.selectByValue("2");
		s.selectByIndex(4);
		s.selectByVisibleText("June");*/
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//select[@id='usernamereg-month']//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='GIO'])[2]")).click();
		
				

	}

}
