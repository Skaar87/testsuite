package store.demoqa;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;


public class SearchProductsTest {

	Logger logger = Logger.getLogger(this.getClass());
	static SearchProducts start;

	@Before
	public void beforeClass() {
		start = new SearchProducts();
	}
	
	@AfterClass
	public static void Shuttdown(){
	start.closedriver();
	}
	
	@Test
	public void A(){
		start.A();
	}

	

}
