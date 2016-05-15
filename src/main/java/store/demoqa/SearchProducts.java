package store.demoqa;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;




public class SearchProducts{

	WebDriver driver = new FirefoxDriver();

	public SearchProducts(){
		driver.get("http://store.demoqa.com/");
	}

	public void closedriver(){
		driver.close();
	}

	public void A() {
		driver.findElement(By.className("search")).sendKeys("Magic Mouse");
		driver.findElement(By.className("search")).sendKeys(Keys.RETURN);
		String MM = driver.findElement(By.linkText("Magic Mouse")).getText();
		Assert.assertEquals("Error unexpected product: ", "Magic Mouse", MM );

	}

}