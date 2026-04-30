package windowHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrames {


	    public static void main(String[] args) throws InterruptedException {

	        // 1️⃣ Open browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // 2️⃣ Open URL
	        driver.get("http://the-internet.herokuapp.com/nested_frames");

	        // 3️⃣ Switch to TOP frame
	        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

	        // 4️⃣ Verify there are 3 frames inside top frame
	        int topFramesCount = driver.findElements(By.xpath("//frame")).size();
	        System.out.println("Number of frames inside TOP frame: " + topFramesCount);

	        if (topFramesCount == 3) {
	            System.out.println("Verified: 3 frames present in TOP frame.");
	        }

	        // 5️⃣ Switch to LEFT frame
	        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));

	        // 6️⃣ Verify LEFT text
	        String leftText = driver.findElement(By.xpath("//body")).getText();
	        System.out.println("Left Frame Text: " + leftText);

	        if (leftText.equals("LEFT")) {
	            System.out.println("LEFT frame verified.");
	        }

	        // 7️⃣ Switch back to TOP frame
	        driver.switchTo().parentFrame();

	        // 8️⃣ Switch to MIDDLE frame
	        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

	        // 9️⃣ Verify MIDDLE text
	        String middleText = driver.findElement(By.xpath("//div")).getText();
	        System.out.println("Middle Frame Text: " + middleText);

	        if (middleText.equals("MIDDLE")) {
	            System.out.println("MIDDLE frame verified.");
	        }

	        // 🔟 Switch back to TOP frame
	        driver.switchTo().parentFrame();

	        // 1️⃣1️⃣ Switch to RIGHT frame
	        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));

	        // 1️⃣2️⃣ Verify RIGHT text
	        String rightText = driver.findElement(By.xpath("//body")).getText();
	        System.out.println("Right Frame Text: " + rightText);

	        if (rightText.equals("RIGHT")) {
	            System.out.println("RIGHT frame verified.");
	        }

	        // 1️⃣3️⃣ Switch back to TOP frame
	        driver.switchTo().parentFrame();

	        // 1️⃣4️⃣ Switch back to main page
	        driver.switchTo().defaultContent();

	        // 1️⃣5️⃣ Switch to BOTTOM frame
	        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));

	        // 1️⃣6️⃣ Verify BOTTOM text
	        String bottomText = driver.findElement(By.xpath("//body")).getText();
	        System.out.println("Bottom Frame Text: " + bottomText);

	        if (bottomText.equals("BOTTOM")) {
	            System.out.println("BOTTOM frame verified.");
	        }

	        // 1️⃣7️⃣ Switch back to main page
	        driver.switchTo().defaultContent();
	        
	        String title = driver.getTitle();
	        System.out.println("Page Title: " + title);

	        // Verify page title
	        if (driver.getTitle().equals("Frames")) {
	            System.out.println("Page title verified: Frames");
	        }else {
	        	System.out.println("no page title");
	        }

	        Thread.sleep(5000);
	       // driver.quit();
	    }
	

}
