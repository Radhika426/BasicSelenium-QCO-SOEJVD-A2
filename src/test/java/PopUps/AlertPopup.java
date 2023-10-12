package PopUps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import Generic_Libraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {
public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.doubleClick(plus).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		WebDriverUtilities utl=new WebDriverUtilities();
		utl.alertDismiss(driver);
		//Alert al = driver.switchTo().alert();
		//System.out.println(al.getText());
		//al.accept();
		//al.dismiss();

	}

}
