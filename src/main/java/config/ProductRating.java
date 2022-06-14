package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductRating {

String custRatingString;

String productString;
	@Test
	public void rating() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		//drive.get("https://www.flipkart.com/");
		drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       Properties obj = new Properties();
       FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\config.properties");
       obj.load(objfile);
       
       drive.get(obj.getProperty("URL"));
       drive.findElement(By.xpath(obj.getProperty("popUpClose"))).click();     
       drive.findElement(By.xpath(obj.getProperty("search"))).sendKeys("phone");
	   drive.findElement(By.xpath(obj.getProperty("searchclick"))).click();	
       
       
       
       List<WebElement> ratings = drive.findElements(By.xpath(obj.getProperty("rating")));
      
       List<String> ratList = new ArrayList<String>();

       for (WebElement element : ratings) {
    	   
        custRatingString = element.getText();
        
        System.out.println(" Name and Rating of phone : \n" + custRatingString);
        ratList.add(custRatingString);
        } 	
       
	TreeSet<Double> fullrate = new TreeSet<Double>();
	
	for (String productrateString : ratList) {
	double custrate = Double.parseDouble(productrateString);
	fullrate.add(custrate);
		
		}
		System.out.println(" Highest rating " + fullrate.last());
		System.out.println("Lowest rating " + fullrate.first());
		
	       List<WebElement> productss = drive.findElements(By.xpath(obj.getProperty("products")));
	      
	       List<String> pList = new ArrayList<String>();

	       for (WebElement element : productss) {
	    	   
	        productString = element.getText();
	        
	        System.out.println(" name of phones : \n" + productString);
	        pList.add(productString);
	        } 	
	       
		TreeSet<String> allproduct = new TreeSet<String>();
		
		for (String productname : pList) {
		String productDetail = String.valueOf(productname);
		allproduct.add(productDetail);
			
			}
			System.out.println(" Highest rating product " + allproduct.last());
			System.out.println(" Lowest rating product " + allproduct.first());
		
		
		
		
		
	}	
}
		
	   					
	    
	
	


