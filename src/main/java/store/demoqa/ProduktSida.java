package store.demoqa;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProduktSida {

	WebDriver driver = new FirefoxDriver();

	public ProduktSida(){
		driver.get("http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/");
	}
	
	public void closedriver(){
		driver.close();
	}


/* Produkt_Sida contains 2A and B*/
	public void Produkt_Sida() throws InterruptedException {
		String title = driver.findElement(By.className("prodtitle")).getText();
		Assert.assertEquals("Error unexpected title: ", "Magic Mouse", title);

		String MM = "Splashing Pixels' WordPress e-commerce themes offer the best e-commerce solution for online stores. Our highly customizable WordPress e-commerce theme design and technology is unlike anything else on the market. We put an amazing amount of care and detail into the design and functionality to ensure that we're creating the best user experience for your customers.";
		String s = driver.findElement(By.className("product_description")).getText();
		Assert.assertEquals("Error unexpected description: ", MM, s);

		String p = driver.findElement(By.className("currentprice")).getText();
		Assert.assertEquals("Error unexpected price: ", "$150.00", p);
		
		int count1 = Integer.parseInt(driver.findElement(By.className("count")).getText());
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		int count2 = Integer.parseInt(driver.findElement(By.className("count")).getText());
		Assert.assertEquals("Error unexpected number of items in the cart: ", count1 + 1, count2);
		
	}
	


}
