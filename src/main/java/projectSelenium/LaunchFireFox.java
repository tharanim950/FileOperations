package projectSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFireFox {
	
	    public static void main(String[] args) {
	    	
	    	WebDriverManager.firefoxdriver().setup();
	    	
	    	FirefoxOptions options = new FirefoxOptions();
	        options.addArguments("-private");

	       
	        WebDriver driver = new FirefoxDriver(options);

	       
	        driver.manage().window().maximize();

	     
	        driver.get("https://www.google.com");

	       
	        System.out.println("Current URL: " + driver.getCurrentUrl());

	       
	        driver.navigate().refresh();

	     
	        driver.quit();
	    }
	}
	


