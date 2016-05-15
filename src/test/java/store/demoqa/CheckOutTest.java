package store.demoqa;

import org.apache.log4j.Logger;

import org.junit.Before;
import org.junit.Test;


public class CheckOutTest {

	Logger logger = Logger.getLogger(this.getClass());
	static CheckOut start;

	@Before
	public void beforeClass() {
		start = new CheckOut();
	}
	
	
	@Test
	public void Ai(){
		start.Ai();
		start.closedriver();
	}
	
	@Test
	public void C() throws InterruptedException{
		start.C();
		start.closedriver();
	}
	
	@Test
	public void Di() throws InterruptedException{
		start.Di();
		start.closedriver();
	}
	
	@Test
	public void Dii() throws InterruptedException{
		start.Dii();
		start.closedriver();
	}
	
	@Test
	public void EG() throws InterruptedException{
		start.EG();
		start.closedriver();
	}
	
	@Test
	public void F() throws InterruptedException{
		start.F();
		start.closedriver();
	}
	
	

	
	
	

}
