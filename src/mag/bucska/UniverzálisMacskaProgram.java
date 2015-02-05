package mag.bucska;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniverzálisMacskaProgram {

	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void haHalatKapUgrik() {
		Macska cica;
		cica=new Macska();
		assertEquals("Ugrik",cica.kap ("Hal"));
	}
}
