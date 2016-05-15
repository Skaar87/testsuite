package store.demoqa;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class ProduktSidaTest {

	Logger logger = Logger.getLogger(this.getClass());
	static ProduktSida start;

	@Before
	public void beforeClass() {
		start = new ProduktSida();
	}

	@AfterClass
	public static void Shuttdown(){
		start.closedriver();
	}

	@Test
	public void Produkt_Sida() throws InterruptedException {
		start.Produkt_Sida();
	}





}
