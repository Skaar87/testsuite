package store.demoqa;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;




public class AddToCart{

	WebDriver driver = new FirefoxDriver();

	public AddToCart(){
		driver.get("http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/");
	}

	public void closedriver(){
		driver.close();
	}
	
	public void Cart() throws InterruptedException{
		
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(2000);
		String MM = driver.findElement(By.xpath("//*[@id='fancy_notification_content']/span")).getText();
		Assert.assertEquals("Error unexpected product: ","You just added \"Magic Mouse\" to your cart." , MM);
		Thread.sleep(2000);
		
		driver.findElement(By.className("continue_shopping")).click();
		Assert.assertEquals("Error Continue button not working: ", "Magic Mouse | ONLINE STORE", driver.getTitle());
		
		Thread.sleep(2000);
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("go_to_checkout")).click();
		Assert.assertEquals("Error Checkout button not working: ","Checkout | ONLINE STORE" ,driver.getTitle());
		
		
	}
	



}