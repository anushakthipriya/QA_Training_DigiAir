package automationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables_ClickMeMouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Add 
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Ivana ");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Kimberley");
		Thread.sleep(3000);
		driver.findElement(By.id("userEmail")).sendKeys("Kim@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("age")).sendKeys("25");
		Thread.sleep(3000);
		driver.findElement(By.id("salary")).sendKeys("10000");
		Thread.sleep(3000);
		driver.findElement(By.id("department")).sendKeys("Sales");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		String element = driver.findElement(By.xpath("(//*[contains(@class,'rt-tr ')])[3]")).getText();
		System.out.println("Before Edit" + '\n' + element);
	
		//Edit
		Thread.sleep(3000);
		driver.findElement(By.id("edit-record-3")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("salary")).clear();
		driver.findElement(By.id("salary")).sendKeys("10000");
		Thread.sleep(3000);
		driver.findElement(By.id("department")).clear();
		driver.findElement(By.id("department")).sendKeys("HR");
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		String element1 = driver.findElement(By.xpath("(//*[contains(@class,'rt-tr ')])[3]")).getText();
		System.out.println("After Edit" +'\n'+ element1);
		
		//Buttons
		Thread.sleep(2000);
		WebElement click1 = driver.findElement(By.xpath("//li[@id= 'item-4']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", click1); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains (@class, 'tn-primary')])[3]")).click();
		String ele = driver.findElement(By.id("dynamicClickMessage")).getText();
		System.out.println("Text appears afetr Click Me is " + ele);
		
}

}
