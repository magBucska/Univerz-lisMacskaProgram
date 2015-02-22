package mag.bucska;

import java.util.HashMap;
import java.util.Map;

public class Macska {
	Map<String, String> macskaMap ;
	public String nev; 
	
	public Macska (String neve) {
		this.nev = neve;
		macskaMap = new HashMap<String, String>();
		macskaMap.put("Hal", "Béla Ugrik");
		macskaMap.put("Májkrém", "Béla Dorombol"); 
		macskaMap.put("Csont", "Béla Nyavog");
		macskaMap.put("Egér", "Béla Üvölt");
		macskaMap.put ("Nátha", "Béla Szipog");
	}

	public String kap(String kaja) {
		return macskaMap.get(kaja);
	}
	
}
