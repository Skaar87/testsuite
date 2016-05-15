package store.demoqa;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class ProductCategoryTest {

	Logger logger = Logger.getLogger(this.getClass());
	static ProductCategory start;

	@Before
	public void beforeClass() {
		start = new ProductCategory();
	}
	
	@AfterClass
	public static void Shuttdown(){
	start.closedriver();
	}
	

	@Test
	public void A() throws InterruptedException{
		start.A();
		
	}

	

}
