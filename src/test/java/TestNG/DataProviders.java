package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
	
	@DataProvider
	public Object[][] getData(){
		Object[][] a=new Object[3][2];
		a[0][0]="Radhika";
		a[0][1]="Radhika123";
		
		a[1][0]="Java";
		a[1][1]="Selenium";
		
		a[2][0]="Qspider";
		a[2][1]="Student";
		
		return a;
	}
	
	@Test(dataProvider = "getData")
	public void fb(String data,String data1) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(data);
		driver.findElement(By.id("pass")).sendKeys(data1);
		Thread.sleep(2000);
		driver.quit();
	}

}
