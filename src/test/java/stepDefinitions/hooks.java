package stepDefinitions;

import Cucumber.Automation1.Base;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends Base {
	
	@Before("@MobileTest")
	public void beforevalidation(){
		System.out.println("before hooks");
	}

	
	@After("@MobileTest")
	public void afterValidation(){
		System.out.println("after hooks");
	}
	
	@After("@SeleniumTest")
	public void afterValidating(){
		driver.close();
	}
}
