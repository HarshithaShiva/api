package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic1 {

	@Parameters({"URL"})
	@Test	
	public void MobileCreditCardMethod1(String urlname) {
		System.out.println("Mobile Credit Card TC1");
		System.out.println(urlname);
	}
		
	@Test
	public void MobileCreditCardMethod2() {
		System.out.println("Mobile Credit Card TC2");
	}
	@BeforeClass
	public void bclass() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void bmeth() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void ameth() {
		System.out.println("After method");
	}
	
}
