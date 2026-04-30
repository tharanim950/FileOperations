package projectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {
	
	    public static void main(String[] args) {

	       
	        WebDriver driver = new FirefoxDriver();

	       
	        driver.manage().window().maximize();

	     
	        driver.get("http://google.com");

	       
	        System.out.println("Current URL: " + driver.getCurrentUrl());

	       
	        driver.navigate().refresh();

	     
	        driver.quit();
	    }
	}
	


