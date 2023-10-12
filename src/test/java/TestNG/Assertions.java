package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
	WebDriver driver;
	@Test
	public void fb() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		//Assert.assertEquals(title, "Radhika");
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "Radhika");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void quit() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}

}
