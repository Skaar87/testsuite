package store.demoqa;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckOut{

	WebDriver driver = new FirefoxDriver();

	public CheckOut(){
		driver.get("http://store.demoqa.com/");
	}

	public void closedriver(){
		driver.close();
	}
	
	public void Ai(){
		
		driver.findElement(By.className("cart_icon")).click();
		String empty = driver.findElement(By.className("entry-content")).getText();
		Assert.assertEquals("Error: Cart is not empty: ","Oops, there is nothing in your cart." , empty);
		
	}
	

	public void C() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")).click();
		String empty = driver.findElement(By.className("entry-content")).getText();
		Assert.assertEquals("Error: Cart is not empty: ","Oops, there is nothing in your cart." , empty);
	}
	
	public void Di() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")).click();
		String price = driver.findElement(By.className("pricedisplay")).getText();
		Assert.assertEquals("Error unexpected price: ","$1,500.00", price);	
	}
	
	public void Dii() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")).sendKeys(Keys.BACK_SPACE, "0");
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")).click();
		String empty = driver.findElement(By.className("entry-content")).getText();
		Assert.assertEquals("Error: Cart is not empty: ","Oops, there is nothing in your cart." , empty);
	}
	
	public void EG() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[4]")).click();
		String price = driver.findElement(By.className("yourtotal")).getText();
		Assert.assertEquals("Error unexpected price: ","Sub-Total:$1,500.00", price);	
		driver.findElement(By.className("step2")).click();
		Thread.sleep(5000);
		String headerColor = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[2]")).getCssValue("color");
		Assert.assertEquals("", "rgba(0, 0, 0, 1)", headerColor);
		
	}
	
	public void F() throws InterruptedException {
		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(6000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(5000);
		String headerColor1 = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[1]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator your cart(not black): ", "rgba(0, 0, 0, 1)", headerColor1);
		String headerColor2 = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[2]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator info(not black): ", "rgba(204, 204, 204, 1)", headerColor2);
		String headerColor3 = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[3]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator final(not black): ", "rgba(204, 204, 204, 1)", headerColor3);
		
	}
	



}