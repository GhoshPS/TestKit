package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {
public static void main(String[] args) {
	 
	WebDriverManager.chromedriver().setup();
    WebDriver drive = new ChromeDriver();
    
	drive.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    WebElement searchstore= drive.findElement(By.xpath("//input[@id='small-searchterms']"));
  //display web element return boolean value all three method
    System.out.println("Element Displaystatus " + searchstore.isDisplayed());
    //enable web elements
    System.out.println("Element EnableStatus " + searchstore.isEnabled());
    
    //select method to check whether element is selected or not. used for radio button,checkbox,dropdown
    
    WebElement male= drive.findElement(By.xpath("//input[@id='gender-male']"));
    WebElement female= drive.findElement(By.xpath("//input[@id='gender-female']"));
    
    System.out.println(male.isSelected());//False
    System.out.println(female.isSelected());//False
    
    male.click();//select male radio button
    
    System.out.println(male.isSelected());//true
    System.out.println(female.isSelected());//False
    
  female.click();//select female radio button
    
    System.out.println(male.isSelected());//false
    System.out.println(female.isSelected());//true
}
}
