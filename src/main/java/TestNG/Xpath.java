package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void name() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/signup");
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Pritsishankar");
		WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
		last.sendKeys("Ghosh");
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("1234567892");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("pritis@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("home");
		
		//span[@title='Customer']		
		Thread.sleep(5000);
	   Select accounttype= new Select(driver.findElement(By.id("fadein")));
	   accounttype.selectByVisibleText("Agent");
	}
	
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	name();
}

}
