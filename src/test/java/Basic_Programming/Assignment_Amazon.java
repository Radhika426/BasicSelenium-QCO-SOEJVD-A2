package Basic_Programming;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Amazon {
public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[contains(text(),'Redmi Note 12 5G Matte Black 6GB RAM 128GB ROM')]")).click();
	    Set<String> child = driver.getWindowHandles();
	    for(String b:child) {
	    	driver.switchTo().window(b);
	    }
	    //WebElement price = driver.findElement(By.xpath("(//span[@id='productTitle']/../../../../..//span[text()='₹21,999'])[2]"));
	    WebElement price = driver.findElement(By.xpath("(//span[@id='productTitle']/ancestor::div//span[text()='₹21,999'])[2]"));
	    System.out.println(price.getText());
	    Thread.sleep(3000);
	    driver.quit();
		

	}

}
