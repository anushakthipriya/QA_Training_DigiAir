package automation1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://thebizio.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div//*[@class = 'nav-link']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder = 'first name']")).sendKeys("Anu");
		
		driver.findElement(By.xpath("//div//*[@name = 'lastName']")).sendKeys("Shakthi Priya");
		
		driver.findElement(By.xpath("//form//input[@name= 'userEmail']")).sendKeys("prod.bzo.9999@gmail.com");
		
		driver.findElement(By.xpath("//form//input[@placeholder = 'mm/dd/yyyy']")).sendKeys("01/01/2000");
		
		Select se = new Select(driver.findElement(By.xpath("//div//*[@name = 'state']")));
				
		se.selectByIndex(2);
		
		driver.findElement(By.xpath("//form// input[@name= 'city']")).sendKeys("Rogers");
		
		driver.findElement(By.xpath("//form// input[@name= 'userName']")).sendKeys("Anu123");
				
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
					By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
		 
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
		 
		/*driver.switchTo().frame(0);
		WebElement captcha =  driver.findElement(By.id("recaptcha-anchor-label"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", captcha);
		*/
		
		driver.findElement(By.cssSelector("input[name='stayInformedAboutBizio']")).isSelected();
		driver.findElement(By.cssSelector("input[name='stayInformedAboutBizio']")).click();
		
		driver.findElement(By.cssSelector("input[name='termsConditionsAgreed']")).isSelected();
		driver.findElement(By.cssSelector("input[name='termsConditionsAgreed']")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
				
	}

}
