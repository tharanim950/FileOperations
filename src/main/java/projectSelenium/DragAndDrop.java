package projectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
	

	public static void main(String[] args) throws InterruptedException {

	        
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        
	        driver.get("https://jqueryui.com/droppable/");

	        
	        driver.switchTo().frame(0);

	        
	        WebElement source = driver.findElement(By.id("draggable"));
	        WebElement target = driver.findElement(By.id("droppable"));

	       
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(source, target).perform();

	        
	        String bgColor = target.getCssValue("background-color");
	        System.out.println("Background Color after drop: " + bgColor);
	        
	       

	        if (bgColor.contains("rgba(255, 250, 144, 1)")) {  
	            System.out.println("Color changed successfully.");
	        } else {
	            System.out.println("Color did not change.");
	        }

	        
	        String targetText = target.getText();
	        System.out.println("Target Text: " + targetText);

	        if (targetText.equals("Dropped!")) {
	            System.out.println("Text changed successfully.");
	        } else {
	            System.out.println("Text did not change.");
	        }

	        Thread.sleep(5000); 
	        driver.quit();
	    }
	}


