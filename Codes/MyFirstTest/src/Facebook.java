import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("name");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("acdefgh");
		driver.findElement(By.cssSelector("input#u_0_2")).click();
		
		
		/*driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.name("username")).sendKeys("name");
		driver.findElement(By.id("password")).sendKeys("acdkdk");*/
		
		

	}
	
}
