package projectSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	

	    public static void main(String[] args) throws InterruptedException {
	    	
	    	WebDriverManager.chromedriver().setup();

	        
	        WebDriver driver = new ChromeDriver();

	        Thread.sleep(2000);
	        driver.manage().window().maximize();

	       
	        driver.get("https://www.demoblaze.com");

	        
	        String actualTitle = driver.getTitle();

	        
	        if (actualTitle.equalsIgnoreCase("STORE")) {
	            System.out.println("Page landed on correct website");
	        } else {
	            System.out.println("Page not landed on correct website");
	        }

	        
	        driver.quit();
	    }
	}


