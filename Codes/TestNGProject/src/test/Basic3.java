package test;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic3 extends GlobalVariable {
	
	@Parameters({"URL","Username"})
	@Test
	public void WebDebitCardMethod1(String urlname,String username) {
		System.out.println("Web Debit Card TC1");
		System.out.println(urlname);
		System.out.println(username);
	}
		
	@Test
	public void WebDebitCardMethod2() {
		System.out.println("Web Debit Card TC2");
	}
	
	@Test
	public void launchbrowser() throws IOException {
		login();
	}

}
