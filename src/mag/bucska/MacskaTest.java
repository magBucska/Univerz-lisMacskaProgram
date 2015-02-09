package mag.bucska;

import static org.junit.Assert.*;

import org.junit.Test;

public class MacskaTest {
	
	@Test
	public void haHalatKapUgrik() {
		Macska cica;
		cica=new Macska();
		assertEquals("Ugrik",cica.kap ("Hal"));
	}
	
	@Test
	public void haMajkremetKapDorombol() {
		Macska cica=new Macska();
		assertEquals("Dorombol",cica.kap ("Májkrém"));
	}

}
