package store.demoqa;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;


public class HomeFlikTest {

	Logger logger = Logger.getLogger(this.getClass());
	static HomeFlik start;

	@Before
	public void beforeClass() {
		start = new HomeFlik();
	}
	

	

	@Test
	public void Ai() {
		start.Ai();
		start.closedriver();
		
	}
	
	@Test
	public void Aii() {
		start.Aii();
		start.closedriver();
		
	}
	
	@Test
	public void Aiii() {
		start.Aiii();
		start.closedriver();
		
	}
	
	@Test
	public void Aiv() throws InterruptedException {
		start.Aiv();
		start.closedriver();
		
	}
	
	@Test
	public void Av() {
		start.Av();
		start.closedriver();
		
	}


}
