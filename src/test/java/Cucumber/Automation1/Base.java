package Cucumber.Automation1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver getdriver() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\durga nayak\\selenium\\Automation1\\src\\test\\java\\Cucumber\\Automation1\\global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\durga nayak\\Durga\\chromedriver.exe");
	       driver= new ChromeDriver();
	       driver.get(prop.getProperty("url")); 
		return driver;
	}

}
