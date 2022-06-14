package TestNG;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Box;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	String brand;
	@Test
	void checking() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Launch url");
		String url= scanner.next();
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver drive = new ChromeDriver();
		drive.get(url);
		
		
		WebElement search = drive.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("phone");
		search.sendKeys(Keys.ENTER);
		

       List<WebElement> checkboxes = drive.findElements(By.xpath("//*[@aria-labelledby='p_89-title']"));

       drive.findElement(By.xpath("(//*[@class='a-expander-prompt'])[2]")).click();

for (WebElement element : checkboxes) {


 //for (int index = 0; index < checkboxes.size(); index++) {
	int index = 0;
brand = checkboxes.get(index).getText();
 System.out.println("List the All brands : \n" + brand);

}

System.out.println(" What is brand name : ");
 String string = scanner.next();

if (brand.contains(string)) {
 System.out.println("Brand is there");

} 

else {
	System.out.println("Brand is not there");
}
}
}