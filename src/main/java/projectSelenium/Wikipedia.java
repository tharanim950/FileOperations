package projectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Wikipedia {
	

	    public static void main(String[] args) {

	        
	        WebDriver driver = new ChromeDriver();

	       
	        driver.manage().window().maximize();

	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	       
	        driver.get("https://www.wikipedia.org");

	        
	        driver.findElement(By.id("searchInput"))
	              .sendKeys("Artificial Intelligence");

	        
	        driver.findElement(By.xpath("//button[@type='submit']"))
	              .click();

	       
	        driver.findElement(By.linkText("History"))
	              .click();

	        
	        WebElement historyHeading = driver.findElement(By.id("History"));
	        System.out.println("Section Title: " + historyHeading.getText());

	        
	        driver.quit();
	    }
	

}
