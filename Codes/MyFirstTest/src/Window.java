import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S-285102936%3A1615964637589674&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		//System.out.println(driver.getTitle());
		Set<String>ids = driver.getWindowHandles();
		Iterator<String>it = ids.iterator(); 
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
	}

}
