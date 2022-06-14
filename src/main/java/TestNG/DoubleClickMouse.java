package TestNG;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickMouse {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver drive = new ChromeDriver();
	
	drive.get("https://demo.guru99.com/test/simple_context_menu.html");
	drive.manage().window().maximize();
Actions actions = new Actions(drive);
WebElement link = drive.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
actions.doubleClick(link).perform();
//We have to switch to alert box and click on Ok 

Alert alert = drive.switchTo().alert();
System.out.println("Alert Test " + alert.getText());
alert.accept();

drive.quit();

}
}
