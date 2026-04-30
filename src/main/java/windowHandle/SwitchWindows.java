package windowHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class SwitchWindows {


	    public static void main(String[] args) throws InterruptedException {

	        // 1️⃣ Open browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        // 2️⃣ Navigate to URL
	        driver.get("https://the-internet.herokuapp.com/windows");

	        // Store original window
	        String originalWindow = driver.getWindowHandle();
	        Thread.sleep(5000);

	        // 3️⃣ Click "Click Here"
	        driver.findElement(By.linkText("Click Here")).click();
	        Thread.sleep(5000);

	        // 4️⃣ Switch to new window
	        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	        Thread.sleep(5000);

	        Set<String> allWindows = driver.getWindowHandles();

	        for (String windowHandle : allWindows) {
	            if (!windowHandle.equals(originalWindow)) {
	                driver.switchTo().window(windowHandle);
	                break;
	            }
	        }

	        // 5️⃣ Verify text "New Window"
	        WebElement text = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));

	        if (text.getText().equals("New Window")) {
	            System.out.println("New window verified successfully.");
	        } else {
	            System.out.println("Text not matched.");
	        }
	        Thread.sleep(5000);
	        // 6️⃣ Close new window
	        driver.close();
	        Thread.sleep(5000);

	        // 7️⃣ Switch back to original window
	        driver.switchTo().window(originalWindow);

	        if (driver.getTitle().contains("The Internet")) {
	            System.out.println("Returned to original window successfully.");
	        }
	        Thread.sleep(5000);
	        // 8️⃣ Close browser
	       // driver.quit();
	    }
	}
	

