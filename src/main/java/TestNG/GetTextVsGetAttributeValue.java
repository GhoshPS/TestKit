package TestNG;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttributeValue {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://admin-demo.nopcommerce.com/login");
	    WebElement	emailInput=drive.findElement(By.id("Email"));
		
	   // emailInput.clear();
		//emailInput.sendKeys("pritis@gmail.com");
		
		//capture text from input box
	    
	    //System.out.println("Result from getattribute() method " + emailInput.getAttribute("value"));
	    
	    //System.out.println("Result from getText() method " + emailInput.getText());
	    
	  //  Login button buttonContext to find inner text
	    
	    WebElement button= drive.findElement(By.xpath("//button[@class='button-1 login-button']"));
	    
	    System.out.println(button.getAttribute("type"));
	    System.out.println(button.getAttribute("class"));
	    
	    System.out.println(button.getText());
	}

}
