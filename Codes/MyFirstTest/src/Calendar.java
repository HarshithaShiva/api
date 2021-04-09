import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days][class='datepicker-switch']")).getText().contains("March")) {
		driver.findElement(By.cssSelector("[class = 'datepicker-days'] th[class='next']")).click();	
		}
		
		int count = driver.findElements(By.className("day")).size();
		for(int i = 0;i<count;i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("26")) {
				driver.findElements(By.className("day")).get(i).click();
			}
		}
		

	}

}
