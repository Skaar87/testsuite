package store.demoqa;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductCategory{

	WebDriver driver = new FirefoxDriver();

	public ProductCategory(){
		driver.get("http://store.demoqa.com/");
	}

	public void closedriver(){
		driver.close();
	}

	public void A() throws InterruptedException {


		WebElement element1 = driver.findElement(By.linkText("Product Category"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Accessories")).click();
		Assert.assertEquals("Error unexpected page: ", "Accessories | ONLINE STORE" ,driver.getTitle());
		
		
		
		WebElement element2 = driver.findElement(By.linkText("Product Category"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(element2).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("iMacs")).click();
		Assert.assertEquals("Error unexpected page: ", "iMacs | ONLINE STORE" ,driver.getTitle());
		
	
		
		WebElement element3 = driver.findElement(By.linkText("Product Category"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(element3).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("iPads")).click();
		Assert.assertEquals("Error unexpected page: ", "iPads | ONLINE STORE" ,driver.getTitle());
		
		
		
		WebElement element4 = driver.findElement(By.linkText("Product Category"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(element4).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("iPhones")).click();
		Assert.assertEquals("Error unexpected page: ", "iPhones | ONLINE STORE" ,driver.getTitle());
		
		
		
		WebElement element5 = driver.findElement(By.linkText("Product Category"));
		Actions action5 = new Actions(driver);
		action5.moveToElement(element5).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("iPods")).click();
		Assert.assertEquals("Error unexpected page: ", "iPods | ONLINE STORE" ,driver.getTitle());
		
		
		
		WebElement element6 = driver.findElement(By.linkText("Product Category"));
		Actions action6 = new Actions(driver);
		action6.moveToElement(element6).perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("MacBooks")).click();
		Assert.assertEquals("Error unexpected page: ", "MacBooks | ONLINE STORE" ,driver.getTitle());

	}

}