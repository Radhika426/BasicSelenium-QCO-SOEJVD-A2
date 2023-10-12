package POM_Practice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import POM.FacebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		FacebookLoginPage flp=new FacebookLoginPage(driver);
		flp.emailTextfield("Radhika");
		flp.passwordTextfield("Radhika123");
		flp.loginButton();

	}

}
