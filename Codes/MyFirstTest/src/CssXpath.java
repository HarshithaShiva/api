import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		/*driver.findElement(By.xpath("//*[@id='username']")).sendKeys("name");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("vhsivhsihv");
		driver.findElement(By.xpath("//*[@id='Login']]")).click();*/
		
		
		driver.findElement(By.cssSelector("#username")).sendKeys("name");
		driver.findElement(By.cssSelector("#password")).sendKeys("name");
		driver.findElement(By.cssSelector("#Login")).click();
		

	}

}
