package store.demoqa;

import java.text.ParseException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class CheckOutFinalTest {

	Logger logger = Logger.getLogger(this.getClass());
	static CheckOutFinal start;

	@Before
	public void beforeClass() {
		start = new CheckOutFinal();
	}
	

	
	@Test
	public void Ai_Shipping_Price() throws InterruptedException, ParseException{
		start.Ai_Shipping_Price();
		start.closedriver();
	}
	
	

	@Test
	public void Purchase() throws InterruptedException{
		start.Purchase();
		start.closedriver();
	}

	
	
	

}
