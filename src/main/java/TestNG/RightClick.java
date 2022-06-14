package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		drive.manage().window().maximize();//maximize the page
		
		WebElement button=drive.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//we are using action class to perform click operation
		Actions act = new Actions(drive);
		
		act.contextClick(button).perform();//perform is build and complete action
		
	}

}
