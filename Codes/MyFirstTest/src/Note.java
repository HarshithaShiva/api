import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Note {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qualitestgroup.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement FooterDriver = driver.findElement(By.xpath("//body/div[@id='page']/footer[@id='main_footer']/div[2]"));
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		WebElement ColumnDriver = driver.findElement(By.xpath("//body/div[@id='page']/footer[@id='main_footer']/div[2]/div[1]/div[1]/div[1]"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<ColumnDriver.findElements(By.tagName("a")).size();i++){
			String ClickTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickTab);
			Thread.sleep(5000L);
		}
		
		Set<String>ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
			
			
			
		

	}

}
