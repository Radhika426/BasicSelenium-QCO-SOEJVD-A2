package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Radhika");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Radhika426");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
