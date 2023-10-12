package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Xpath by attribute
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Radhika");
		//Xpath by contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Radhika426");
		//Xpath by text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//Xpath by contains text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		

	}

}
