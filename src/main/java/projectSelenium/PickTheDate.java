package projectSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PickTheDate {

	    public static void main(String[] args) {

	      
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	       
	        driver.get("https://jqueryui.com/datepicker/");

	        
	        driver.switchTo().frame(0);

	        
	        driver.findElement(By.id("datepicker")).click();

	        
	        driver.findElement(By.xpath("//a[@title='Next']")).click();

	       
	        driver.findElement(By.xpath("//a[text()='22']")).click();

	        
	        WebElement dateInput = driver.findElement(By.id("datepicker"));
	        String selectedDate = dateInput.getAttribute("value");
	        System.out.println("Selected Date: " + selectedDate);

	       
	        driver.quit();
	    }
	}
	


