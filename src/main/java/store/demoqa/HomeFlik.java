package store.demoqa;

import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeFlik {

	WebDriver driver = new FirefoxDriver();

	public HomeFlik(){
		driver.get("http://store.demoqa.com/");
	}

	public void closedriver(){
		driver.close();
	}

	public void Ai(){
		driver.findElement(By.className("buynow")).click();
		Assert.assertEquals("Error unexpected page: ", "Magic Mouse | ONLINE STORE", driver.getTitle());

	}



	public void Aii(){

		driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/products-page/product-category/accessories/magic-mouse/']")).click();
		Assert.assertEquals("Error unexpected page: ", "Magic Mouse | ONLINE STORE", driver.getTitle());

	}

	public void Aiii(){

		driver.findElement(By.partialLinkText("More Info")).click();
		Assert.assertEquals("Error unexpected page: ", "Magic Mouse | ONLINE STORE", driver.getTitle());

	}

	public void Aiv() throws InterruptedException{
		ArrayList<String> listOfSlides = new ArrayList<String>();
		String currentSlide;
		for(int i=0;i<5;i++) {
			currentSlide = driver.findElement(By.cssSelector(".product_description>h2")).getText();
			if( false == listOfSlides.contains(currentSlide) ) {
				listOfSlides.add(currentSlide);

				if( listOfSlides.size() == 3 ) {
					break;
				}
			}

			Thread.sleep(5000);
		}

		Assert.assertEquals("Error unexpected number of slides: ", 3, listOfSlides.size());
	}

	public void Av(){

		driver.findElement(By.xpath("//*[@id='slide_menu']/a[3]")).click();
		driver.findElement(By.xpath("//*[@id='slide_menu']/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='slide_menu']/a[1]")).click();
		//Fattas en assertion

	}
}


