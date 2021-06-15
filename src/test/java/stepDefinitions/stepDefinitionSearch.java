package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Cucumber.Automation1.Base;
import cucumber.api.java.en.And;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinitionSearch {
	
	public WebDriver driver;
	
	@Given("^user is on GreenKart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
		driver = Base.getdriver();
       
         
    }

    @When("^user search for \"([^\"]*)\" vegetable$")
    public void user_search_for_something_vegetable(String strArg1) throws Throwable {
    	
    	 driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	 Thread.sleep(3000);
        
    }
    
    @And("^Added more of the same item to cart$")
    public void added_more_of_the_same_item_to_cart() throws Throwable {
    	driver.findElement(By.xpath("//a[@class='increment']")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    	
        //throw new PendingException();
    }

    @And("^proceeds to checkout$")
    public void proceeds_to_checkout() throws Throwable {
    	driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    	Thread.sleep(2000);
        //throw new PendingException();
    }

    @Then("^\"([^\"]*)\" result is displayed$")
    public void something_result_is_displayed(String strArg1) throws Throwable {
    Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
       
    }
    @Then("^verify if \"([^\"]*)\" result is displayed$")
    public void verify_if_something_result_is_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.xpath("//p[@class='product-name']")).getText().contains(strArg1));
        //throw new PendingException();
    }

}
