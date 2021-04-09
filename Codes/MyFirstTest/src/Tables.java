import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/32278/ind-vs-eng-4th-t20i-england-tour-of-india-2021");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-33 cb-col-rt']"));
		int rowcountdriver = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for (int i = 0;i<count;i++) {
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueint = Integer.parseInt(value);
			
			
		}
		System.out.println(sum);
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extravalues = Integer.parseInt(Extras);
		int Totalsum = sum+extravalues;
		System.out.println(Totalsum);
		
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalValue = Integer.parseInt(Extras);
		if(ActualTotalValue == Totalsum) {
			System.out.println("Count Matches");

		}
		System.out.println("Count is not Matches");
		
		
		



	}

}
