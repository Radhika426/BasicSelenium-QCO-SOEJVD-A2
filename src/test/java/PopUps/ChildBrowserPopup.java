package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Generic_Libraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopup {
public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//a[text()=' Spanish ']")).click();
		driver.findElement(By.xpath("//a[text()=' English']")).click();
		WebDriverUtilities utl=new WebDriverUtilities();
		utl.parentBrowser(driver);
		//String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		utl.childBrowser(driver);
		/*Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}*/
		driver.findElement(By.id("mytext")).sendKeys("Radhika");
		Thread.sleep(3000);
		utl.parentBrowser(driver);
		//driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();

	}

}
