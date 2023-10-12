package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Ancestor {
public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/Lenovo-IdeaPad-12450H-Backlit-83BG000PIN/dp/B0CFF42RJ6/ref=sr_1_1_sspa?crid=32ZRDNYD34NF7&"
				+ "keywords=lenovo&qid=1695459551&sprefix=lenovo%2Caps%2C592&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        WebElement price = driver.findElement(By.xpath("(((//span[contains(text(),'Lenovo IdeaPad Slim 5 "
        		+ "Intel Core i5 12450H 16')])[3]/ancestor::div[@id='centerCol'])[1]//span[@class='a-price-whole'])"
        		+ "[1]"));
        System.out.println(price.getText());
      
        
	}

}
