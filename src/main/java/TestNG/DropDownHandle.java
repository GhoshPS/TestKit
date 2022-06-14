package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.opencart.com/index.php?route=account/register");
		//here we have capture drop down element
		WebElement drpCountryEle=drive.findElement(By.id("input-country"));
		
		//we have pass the webelement in select class object
		Select drpCountry=new Select(drpCountryEle);
		
		//drpCountry.selectByVisibleText("Greece");
		
		//drpCountry.selectByValue("44");
		
		//drpCountry.selectByIndex(14);
		
		//Now we will select option without using select method
		
		List<WebElement>alloptionElements= drpCountry.getOptions();
		
		for (WebElement optionElement : alloptionElements)
		{
			if (optionElement.getText().equals("Ghana")) 
			{
				optionElement.click();
			}
		}
		
		}
	}

