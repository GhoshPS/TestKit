package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverFunction {
	public static void main(String[] args) {
		//one way to launch webpage
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritishankar.ghosh\\Desktop\\Chrome driver\\chromedriver.exe");
	    WebDriver webDriver = new ChromeDriver();
	    webDriver.get("http://www.google.co.in");
	   webDriver.findElement(By.name("q")).sendKeys("India Post"+ Keys.ENTER  );*/
		
		//2nd way to launch web page
        WebDriverManager.chromedriver().setup();
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
		
		//To capture the title of webpage in console
		System.out.println("webpage title " + drive.getTitle());
		
		//To capture url of webpage in console
		System.out.println("Url of webpage " + drive.getCurrentUrl());
		
		//capture entire source of website
		System.out.println(drive.getPageSource());

		
	}
}
