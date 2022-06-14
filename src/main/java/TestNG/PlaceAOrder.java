package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class PlaceAOrder {

	@Test
	void testing() throws InterruptedException, IOException {
		
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritishankar.ghosh\\Desktop\\Chrome driver\\chromedriver.exe");
	    WebDriver drive = new ChromeDriver();
	    drive.get("https://www.amazon.in");
	    drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = drive.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("phone");
		search.sendKeys(Keys.ENTER);
		WebElement find = drive.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		find.click();
		
		Set<String> searchingSet= drive.getWindowHandles();
		Iterator<String> foundIterator = searchingSet.iterator();
		String url1= foundIterator.next();
		String url2= foundIterator.next();
        drive.switchTo().window(url2);
		WebElement found = drive.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		found.click();
		
	   
		//Thread.sleep(7000);
		
		WebElement cartadd = drive.findElement(By.xpath("(//input[@class='a-button-input'])[33]"));
		cartadd.click();
		
	   //Thread.sleep(5000);

		WebElement cartadding = drive.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		cartadding.click();
		
		Thread.sleep(5000);

		WebElement signin = drive.findElement(By.xpath("//input[@id='ap_email']"));
		signin.sendKeys("pritishghosh69@yahoo.com");
		
		
		WebElement signinn = drive.findElement(By.xpath("//input[@id='continue']"));
		signinn.click();
		
		//Thread.sleep(5000);

		WebElement password = drive.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("bapi1988");
		
		
		WebElement passwords = drive.findElement(By.xpath("//input[@id='signInSubmit']"));
		passwords.click();
		
		//Thread.sleep(5000);

		WebElement address = drive.findElement(By.xpath("(//a[@class='a-declarative a-button-text '])[1]"));
		address.click();
		
		TakesScreenshot screenshot = (TakesScreenshot) drive;
		File path = screenshot.getScreenshotAs(OutputType.FILE);
		File source = new File("C:\\Users\\pritishankar.ghosh\\Pictures\\Saved Pictures\\Priti.jpeg");
		FileHandler.copy(path, source);
}
	}
}
