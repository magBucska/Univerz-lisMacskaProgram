package mag.bucska;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MacskaTest {
	Macska cica;

	@Test
	public void haHalatKapUgrik() {
		assertEquals("Ugrik",cica.kap ("Hal"));
	}

	@Before
	public void setUp() {
		 cica=new Macska()	;
	}

	@Test
	public void haMajkremetKapDorombol() {
		assertEquals("Dorombol",cica.kap ("Májkrém"));
	}

}
