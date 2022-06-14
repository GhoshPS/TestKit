package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.myntra.com/");
		drive.manage().window().maximize();
		
		WebElement deskmenu= drive.findElement(By.xpath("//a[@href='/shop/men']"));
		WebElement tshirt= drive.findElement(By.xpath("//a[@href='/men-tshirts']"));
		
		Actions actions = new Actions(drive);
		
		actions.moveToElement(deskmenu).moveToElement(tshirt).click().perform();
		
	}
}