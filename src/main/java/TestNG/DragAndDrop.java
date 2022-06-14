package TestNG;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class DragAndDrop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://demoqa.com/droppable/");
		
		WebElement drag = drive.findElement(By.id("draggable"));
		WebElement dropElement = drive.findElement(By.id("droppable"));
		
		Actions action =  new Actions(drive);
		action.dragAndDrop(drag, dropElement).perform();

}
}