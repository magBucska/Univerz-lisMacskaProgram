package mag.bucska;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MacskaTest {
	Macska cica;

	@Test
	public void haHalatKapUgrik() {
		assertEquals("Béla Ugrik",cica.kap ("Hal"));
	}

	@Before
	public void setUp() {
		 cica=new Macska("Béla")	;
	}

	@Test
	public void haMajkremetKapDorombol() {
		assertEquals("Béla Dorombol",cica.kap ("Májkrém"));
	}

	@Test
	public void haCsontotKapNyavog() {
		assertEquals("Béla Nyavog",cica.kap ("Csont"));
	}

	@Test
	public void haEgeretKapÜvölt() {
		assertEquals("Béla Üvölt",cica.kap ("Egér"));
	}

	@Test
	public void haNáthátKapSzipog() {
		assertEquals("Béla Szipog",cica.kap ("Nátha"));
	}

}
