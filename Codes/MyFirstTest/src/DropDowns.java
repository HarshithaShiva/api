import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String)js.executeScript(script);
		System.out.println(text);
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String)js.executeScript(script);
			System.out.println(text);
		}
		
		

	}

}
