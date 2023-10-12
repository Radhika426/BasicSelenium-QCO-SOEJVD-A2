package Generic_Libraries;

import java.io.File;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2) {
		Actions a=new Actions(driver);
		a.dragAndDrop(ele1,ele2).perform();
	}
	
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();;
	}
	
    public void alertDismiss(WebDriver driver) {
    	driver.switchTo().alert().dismiss();
	}
    
    public void parentBrowser(WebDriver driver) {
    	String parent = driver.getWindowHandle();
	}
    
    public void childBrowser(WebDriver driver) {
    	Set<String> child = driver.getWindowHandles();
    	for(String b:child) {
			driver.switchTo().window(b);
		}
	}
    
    public void switchingToFrameByIndex(WebDriver driver, int index) {
    	driver.switchTo().frame(index);
	}
    
    public void switchingToFrameByAttribute(WebDriver driver, String attribute) {
    	driver.switchTo().frame(attribute);
	}
    
    public void switchingToFrameByWebelement(WebDriver driver, WebElement ele) {
    	driver.switchTo().frame(ele);
	}
    
    public void switchingOutOfFrame(WebDriver driver) {
    	driver.switchTo().defaultContent();
	}
    
    public void scrollingWithoutCoordiates(WebDriver driver, WebElement ele) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView;", ele);
    }
    
    public void scrollingWithCoordiates(WebDriver driver, WebElement ele) {
    	Point coOrdinates = ele.getLocation();
		int x = coOrdinates.getX();
		int y = coOrdinates.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
    }
    
    public void takeScreenshot(WebDriver driver, String path) throws Throwable {
    	TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
    }
    
    public void selectByIndex(WebElement ele,int index) {
    	Select s=new Select(ele);
		s.selectByIndex(index);
    }
    
    public void selectByValue(WebElement ele,String value) {
    	Select s=new Select(ele);
		s.selectByValue(value);
    }
    
    public void selectByVisibleText(WebElement ele,String text) {
    	Select s=new Select(ele);
		s.selectByVisibleText(text);
    }
    
    public void selectGetOptions(WebElement ele) {
    	Select s=new Select(ele);
    	List<WebElement> value = s.getOptions();
		System.out.println(value.size());
		for(WebElement b:value) {
			System.out.println(b.getText());
		}
    }
    
    public void allSelectedOptions(WebElement ele) {
    	Select s=new Select(ele);
    	List<WebElement> values = s.getAllSelectedOptions();
		for(WebElement b:values) {
			System.out.println(b.getText());
		}
    }
    
    public void deselectByIndex(WebElement ele,int index) {
    	Select s=new Select(ele);
		s.deselectByIndex(index);
    }
    
    public void deselectByValue(WebElement ele,String value) {
    	Select s=new Select(ele);
		s.deselectByValue(value);
    }
    
    public void deselectByVisibleText(WebElement ele,String text) {
    	Select s=new Select(ele);
		s.deselectByVisibleText(text);
    }
    
    public void deselectAll(WebElement ele) {
    	Select s=new Select(ele);
		s.deselectAll();
    }
    
}
