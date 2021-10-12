package draft.collection;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void map() {
		Map<String, Automobile> mappaAutomobile = new HashMap<String, Automobile>();

		Automobile a1 = new Automobile("ABC123", "Agila", 320);
		mappaAutomobile.put("ABC123", a1);

		Automobile a2 = new Automobile("CDE456", "Ibiza", 100);
		mappaAutomobile.put("CDE456", a2);

		Automobile a3 = new Automobile("FGH789", "Cupra", 400);
		mappaAutomobile.put("FGH789", a3);		
		
		
		System.out.println("Numero di elementi dentro alla mappa: " + mappaAutomobile.size());
		
		//Iterazione base che mostra gli elementi
		
		for(String targaCorrente : mappaAutomobile.keySet()) {
			System.out.println(mappaAutomobile.get(targaCorrente));
		}
	}
}
