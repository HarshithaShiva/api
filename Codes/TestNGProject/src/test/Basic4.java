package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic4 {
	
	@Test
	public void MobileDebitCardMethod1() {
		System.out.println("Mobile Debit Card TC1");
	}
		
	@Test(dataProvider="getData")
	public void MobileDeitCardMethod2(String username, String password) {
		System.out.println("Mobile Debit Card TC2");
		System.out.println(username);
		System.out.println(password);
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="test1";
		data[0][1]="password1";
		
		data[1][0]="test2";
		data[1][1]="password2";
		
		data[2][0]="test3";
		data[2][1]="password3";
		
		return data;
	}
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void asuite() {
		System.out.println("After Suite");
	}

}
