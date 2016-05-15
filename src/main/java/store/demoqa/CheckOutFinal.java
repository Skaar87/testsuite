package store.demoqa;

import java.text.ParseException;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.OrderingComparison.lessThan;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckOutFinal{

	WebDriver driver = new FirefoxDriver();

	public CheckOutFinal(){
		driver.get("http://store.demoqa.com/");
	}

	public void closedriver(){
		driver.close();
	}
	/*Ai_Shipping_Price also contains 7D,E  */
	public void Ai_Shipping_Price() throws InterruptedException, ParseException{

		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("step2")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='uniform-current_country']/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='current_country']/option[233]")).click();
		driver.findElement(By.xpath("//*[@id='change_country']/input[4]")).click();
		String USA = driver.findElement(By.xpath("//*[@id='wpsc_shopping_cart_container']/form/div[3]/table/tbody/tr[2]/td[2]/span/span")).getText();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='uniform-current_country']/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='current_country']/option[216]")).click();
		driver.findElement(By.xpath("//*[@id='change_country']/input[4]")).click();
		String SWE = driver.findElement(By.xpath("//*[@id='wpsc_shopping_cart_container']/form/div[3]/table/tbody/tr[2]/td[2]/span/span")).getText();
		String US = USA.replace("$", "").replace(".00", "");
		String SW = SWE.replace("$", "").replace(".00", "");
		int U = Integer.parseInt(US);
		int S = Integer.parseInt(SW);
		Assert.assertThat("Error USA shipping is not lesser than the Swedish shipping cost: ",Integer.valueOf(U), is(lessThan(S)));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='wpsc_shopping_cart_container']/form/div[1]/table[2]/tbody/tr[3]/td[1]/label")).sendKeys("Silas");
		driver.findElement(By.xpath("//*[@id='shippingSameBilling']")).click();
		String same = driver.findElement(By.id("shippingsameasbillingmessage")).getText();
		Assert.assertEquals("Error: same adress box is not working: ","Your order will be shipped to the billing address", same);
		driver.findElement(By.xpath("//*[@id='shippingSameBilling']")).click();
		/*Fattas en assertion för att kolla om text är kvar efter knapp tryck på same billing adress*/

		String headerColor1 = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[1]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator your cart(not black): ", "rgba(0, 0, 0, 1)", headerColor1);

		String headerColor2 = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[2]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator info(not black): ", "rgba(0, 0, 0, 1)", headerColor2);

		String headerColor3 = driver.findElement(By.xpath("//*[@id='post-29']/div/div[1]/ul/li[3]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator final(not grey): ", "rgba(204, 204, 204, 1)", headerColor3);

	}


	/*Purchase contains 7G and all of the 8 assignments*/
	public void Purchase() throws InterruptedException {

		driver.findElement(By.className("buynow")).click();
		driver.findElement(By.className("wpsc_buy_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("go_to_checkout")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("step2")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='uniform-current_country']/span")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='current_country']/option[216]")).click();
		driver.findElement(By.xpath("//*[@id='change_country']/input[4]")).click();
		String Shipping1 = driver.findElement(By.xpath("//*[@id='wpsc_shopping_cart_container']/form/div[3]/table/tbody/tr[2]/td[2]/span/span")).getText();
		String Total1 = driver.findElement(By.xpath("//*[@id='checkout_total']/span")).getText();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='shippingSameBilling']")).click();
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_9']")).sendKeys("Test@hotmail.com");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_2']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_3']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_4']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_5']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_6']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_18']")).sendKeys("123123123");
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_7']")).click();
		driver.findElement(By.xpath("//*[@id='wpsc_checkout_form_7']")).sendKeys("SWEDEN");
		driver.findElement(By.xpath("//*[@id='wpsc_shopping_cart_container']/form/div[4]/div/div/span/input")).click();
		Thread.sleep(5000);

		String Shipping2 = driver.findElement(By.xpath("//*[@id='post-30']/div/div[2]/p[3]")).getText();
		String Shipp2 = Shipping2.replace("Total Shipping: ", "").replace("\n", "").replace("Total: $173.00", "");
		String Total2 = driver.findElement(By.xpath("//*[@id='post-30']/div/div[2]/p[3]")).getText();
		String Tot2 = Total2.replace("Total Shipping: $23.00", "").replace("\n", "").replace("Total: ", "");

		Assert.assertEquals("Error total shipping cost isnt the same: ",Shipping1, Shipp2);
		Assert.assertEquals("Error total cost isnt the same: ",Total1, Tot2);

		String headerColor1 = driver.findElement(By.xpath("//*[@id='post-30']/div/div[1]/ul/li[1]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator your cart(not black): ", "rgba(0, 0, 0, 1)", headerColor1);

		String headerColor2 = driver.findElement(By.xpath("//*[@id='post-30']/div/div[1]/ul/li[2]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator info(not black): ", "rgba(0, 0, 0, 1)", headerColor2);

		String headerColor3 = driver.findElement(By.xpath("//*[@id='post-30']/div/div[1]/ul/li[3]")).getCssValue("color");
		Assert.assertEquals("Error Bar indicator final(not black): ", "rgba(0, 0, 0, 1)", headerColor3);

	}



}