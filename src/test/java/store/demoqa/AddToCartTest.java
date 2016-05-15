package store.demoqa;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class AddToCartTest {

	Logger logger = Logger.getLogger(this.getClass());
	static AddToCart start;

	@Before
	public void beforeClass() {
		start = new AddToCart();
	}
	
	
	@Test
	public void Cart() throws InterruptedException{
		start.Cart();
		start.closedriver();
	}
	

	
	
	

}
