package projectSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GuviSignup {


	public static void main(String[] args) throws InterruptedException {
	        // 1) Launch Chrome browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        driver.get("https://www.guvi.in/register/");

	        

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")))
	                .sendKeys("Test User");

	        driver.findElement(By.id("email"))
	                .sendKeys("testuser12300@example107.com");

	        driver.findElement(By.id("password"))
	                .sendKeys("Password123uyt04");

	        driver.findElement(By.id("mobileNumber"))
	                .sendKeys("9999999714");
	        

	        // 4) Click on Signup submit
	        driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();

	        WebElement laterButton = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.id("laterBtn")));

	        wait.until(ExpectedConditions.elementToBeClickable(laterButton));

	        laterButton.click();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//*[contains(text(),'Almost Done')]")));

	        System.out.println("Signup likely submitted - check email verification!");
	        
	        WebElement logo = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.cssSelector("img.new-guvi-logo")));

	        ((org.openqa.selenium.JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", logo);

	        // 6) Locate and click Login after signup page
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.id("login-btn")))
	            .click();

	        // 7) Fill login form with same credentials
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys("testuser12300@example107.com");
	        driver.findElement(By.id("password")).sendKeys("Password123uyt04");

	        // 8) Submit login
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.id("mobile-login")))
	            .click();

	        // 9) Verify login success by checking page title or a welcome element
	        wait.until(ExpectedConditions.titleContains("Dashboard"));
	        System.out.println("Login successful — Dashboard loaded!");

	        
	        driver.quit();
	    }
	}


