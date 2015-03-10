package mag.bucska;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MacskaTest {
	Macska cica;

	private void assertAztCsinaljaHogy(Macska cico, String mitKap, String muvelet) {
		String mitCsinal = cico.nev + " " + muvelet;
		assertEquals(mitCsinal,cico.kap (mitKap));
	}


	@Before
	public void setUp() {
		 cica=new Macska("Béla")	;
	}

	@Test
	public void haHalatKapUgrik() {
		assertEquals("Béla Ugrik",cica.kap ("Hal"));
	}

	@Test
	public void aMacskaNeveIsStimmel() {
		Macska masikCica = new Macska("Cirmike");
		assertEquals("Cirmike Ugrik",masikCica.kap ("Hal"));
	}
	
	@Test
	public void haMajkremetKapDorombol() {
		assertAztCsinaljaHogy(cica,"Májkrém", "Dorombol");
	}

	@Test
	public void haCsontotKapNyavog() {
		assertAztCsinaljaHogy(cica,"Csont", "Nyavog");
	}

	@Test
	public void haEgeretKapÜvölt() {
		assertAztCsinaljaHogy(cica,"Egér", "Üvölt");
	}

	@Test
	public void haNáthátKapSzipog() {
		assertAztCsinaljaHogy(cica,"Nátha", "Szipog");
	}
	
	@Test
	public void haGombolyagotKapAddigJátszikAmigNathasNemLesz(){
		assertAztCsinaljaHogy(cica,"Gombolyag", "Játszik");		
		assertAztCsinaljaHogy(cica,"Csont", "Játszik");		
		assertAztCsinaljaHogy(cica,"Májkrém", "Játszik");		
		assertAztCsinaljaHogy(cica,"Nátha", "Szipog");
		assertAztCsinaljaHogy(cica,"Egér", "Üvölt");
	}

}
