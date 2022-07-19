package org.mavenExample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExample1Test {
   @Test
   public void practice1Test() {
	   Reporter.log("TYSS 1--> test1",true);
	   // Reporter.log("TYSS 1--> test1",true);
	   
   }
   @Test
   public void practice2Test() {
	   Reporter.log("TYSS 2--> test1",true);
	   Reporter.log("TYSS 2--> test1",true);
   }
   @Test
   public void practice3Test() {
	   Reporter.log("TYSS 3--> test1",true);
	    Reporter.log("TYSS 3--> test1",true);
   }
}
