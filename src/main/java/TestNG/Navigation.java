package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLDivElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;

public class Navigation {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver drive = new ChromeDriver();
	    
	    //drive.get("https://www.myntra.com");
	    
	    //navigate.to() and get() method operations are same
	    drive.navigate().to("https://www.myntra.com");
	    drive.get("https://www.snapdeal.com/");
	    
	   
	    
	    
	    drive.get("https://www.snapdeal.com/");
	    //navigate commandhere we will back to mytra using navigation code
	    drive.navigate().back();
	  //navigate commandhere we will back to snapdeal using navigation code
	    drive.navigate().forward();
	    
	    //refresh or reload page
	    drive.navigate().refresh();
	}

}
