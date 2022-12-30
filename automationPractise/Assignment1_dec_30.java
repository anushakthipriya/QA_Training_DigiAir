package automationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_dec_30 {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/text-box");
			driver.manage().window().maximize();
			Thread.sleep(2000);
					
			//Text Box
			driver.findElement(By.id("userName")).sendKeys("Anu");
			Thread.sleep(3000);
			driver.findElement(By.id("userEmail")).sendKeys("asp@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("currentAddress")).sendKeys("Tiruvannamalai");
			Thread.sleep(3000);
			driver.findElement(By.id("permanentAddress")).sendKeys("Chennai");
			Thread.sleep(3000);
			WebElement click1 = driver.findElement(By.xpath("//button[@id= 'submit']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", click1);
			
			
			//Check Box
			driver.findElement(By.xpath("//li[@id= 'item-1']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span//*[contains(@class,'rct-icon')])[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@title = 'Expand all']")).click();
			Thread.sleep(3000);
			WebElement text = driver.findElement(By.xpath("//div//*[contains(@class, 'display-result')]"));
			if(text.isDisplayed())
			{
			System.out.println("You have Selected Text will dispaly");
			}
						else
			System.out.println("Element not found");
						
			//Radio Button
		
			driver.findElement(By.xpath("//li[@id= 'item-2']")).click();
			Thread.sleep(3000);
			WebElement click2 = driver.findElement(By.id("impressiveRadio"));
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			js1.executeScript("arguments[0].click()", click2);
			boolean text2 = driver.findElement(By.id("impressiveRadio")).isDisplayed();
}
}