package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StructureTable {

	@Test
	 void testName() throws Exception{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        List<WebElement> totalrows = drive.findElements(By.xpath("//th[@scope='row']"));
	    totalrows.remove(0);
		int size = totalrows.size();
		System.out.println("Structure Size" + "-" + size);
		
		if (size == 4) {
			System.out.println("It has 4 structure only");
			System.out.println();
		} else {
			System.out.println("Incorrect structure");
		}		
		
		int row=drive.findElements(By.xpath(" //table[@class='tsc_table_s13']/tbody/tr")).size();
		//System.out.println("Total raw " + row);
		
		//int colom=drive.findElements(By.xpath("//table[@class='tsc_table_s13']//thead/tr/th")).size();
		//System.out.println("Total column " + colom);
		
		
		System.out.println("Data from table");
		
		for(int rows=1;rows<=row;rows++)
		{
		
			String data= drive.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+ rows +"]")).getText();
			System.out.println(data );
		
		System.out.println();
		}
		
		
		for(int rowig=1;rowig<=row;rowig++)
		{
			String structure= drive.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + rowig + "]/th")).getText();
			if (structure.equals("Burj Khalifa")) 
			{
				String height= drive.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + rowig + "]/td[3]")).getText();
				System.out.println(structure + " " + height );
			}
		}
		
		String lastrow=drive.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr")).getText();
		System.out.println(" last row " + lastrow);
		int count=0;
		String columnumber=drive.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th")).getText();
		String columnumber2=drive.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td")).getText();
		
		if(lastrow.contains(columnumber)) {
			count++;
			
			if (lastrow.contains(columnumber2)) {
				count++;
				
			}
		}
		System.out.println(" Number of columns in last row is " + count);
		drive.quit();
		
		
	
}
}