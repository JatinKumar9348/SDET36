package org.mavenExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExample2Test {
	@Test
	   public void practice1Test() {
//		   String url=System.getProperty("url");
//		   String browser=System.getProperty("browser");
//		   System.out.println(url);
//		   System.out.println(browser);
		   Reporter.log("TYSS 1--> test2",true);
		   System.out.println("change kali");
		   
	   }
	@Test
	   public void practice2Test() {
		   Reporter.log("TYSS 2--> test2",true);
	   }
	@Test
	   public void practice3Test() {
		   Reporter.log("TYSS 3--> test2",true);
	   }
}
