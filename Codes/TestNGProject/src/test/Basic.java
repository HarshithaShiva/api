package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {
	
	@AfterTest
	public void atest() {
		System.out.println("After Test");
	}

	@Test
	public void WebCreditCardMethod1() {
		System.out.println("Web Credit Card TC1");
	}
		
		@Test
		public void WebCreditCardMethod2() {
			System.out.println("Web Credit Card TC2");
		
	}
	
		@Test
		public void dummy() {
			System.out.println("Dum");
		
			
	}
		
		@BeforeTest
		public void btest() {
			System.out.println("Before test");
		}
		@AfterClass
		public void aclass() {
			System.out.println("After class");
		}


}
