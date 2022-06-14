package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.google.com/");
        drive.manage().window().maximize();
        //Implicit wait
         drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         drive.findElement(By.name("q")).sendKeys("Selenium");
         drive.findElement(By.name("q")).sendKeys(Keys.RETURN);
         
         drive.findElement(By.xpath("//div[@id=\"rso\"]//h3[@class='LC20lb MBeuO DKV0Md']")).click();
	}

}
