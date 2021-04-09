import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='package-origin-hp-package']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='package-destination-hp-package']")).sendKeys("Nyc");
		driver.findElement(By.xpath("//input[@id='package-departing-hp-package']")).sendKeys(Keys.ENTER);
		WebDriverWait d = new WebDriverWait(driver,10);
		//d.until(ExpectedConditons.visibilityOfElementsLocated(By.xpath("//button[@id='search-button-hp-package']")));
		driver.findElement(By.xpath("//button[@id='search-button-hp-package']")).click();
		
	}

}
