package mag.bucska;

import java.util.HashMap;
import java.util.Map;
                                                 
public class Macska {
	Map<String, String> macskaMap ;
	public String nev; 
	
	public Macska (String neve) {
		nev = neve;
		macskaMap = new HashMap<String, String>();
		macskaMap.put("Hal", "Ugrik");
		macskaMap.put("Májkrém", "Dorombol"); 
		macskaMap.put("Csont", "Nyavog");
		macskaMap.put("Egér", "Üvölt");
		macskaMap.put ("Nátha", "Szipog");
	}

	public String kap(String kaja) {
		String muvelet = macskaMap.get(kaja);
		return nev + " " + muvelet;
	}
	
}
















