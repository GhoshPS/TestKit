package TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {
 
	public static void main(String[] args) {
     
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
	   drive.get("https://demo.nopcommerce.com/");
	   
	   //findElement()---> return single web element
	   
	   WebElement search=drive.findElement(By.xpath("//input[@id='small-searchterms']"));
	    search.sendKeys("phone");
	    
	    //locater pointing multiple web elements if we use findElement()
	    //It will print first element
	    
	    WebElement element=drive.findElement(By.xpath("//div[@class='footer-upper']//a"));
	    System.out.println(element.getText());//perform action on web element
	    
	  //  WebElement noElement=drive.findElement(By.xpath("//button[@class='button-1 login-box-button']"));
	    
	    //findElements()----->return multiple web elements
	    //for each loop
	    /*List<WebElement> links=drive.findElements(By.xpath("//div[@class='footer-upper']//a"));
	    System.out.println("Elements captured:" + links.size());// number of elements capture 22
	    //We have to write loop statement to get all element from variable and we can iterate all the web element one after another
	    for (WebElement webElement : links) {
			//from above links it will store multiple web element one by one into webElement variable
	    	System.out.println(webElement.getText());
		}*/
	   
	   //If we wants to perform certain action on the element then we have to itirate the list  
	  //  List<WebElement> logo=drive.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
	    //System.out.println((logo.size()));
  // List<WebElement> elements = drive.findElements(By.xpath("//img[contains(title,'Electronic']"));
  // System.out.println(elements.size());
}
	
	
}
