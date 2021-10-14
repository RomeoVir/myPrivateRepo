package draft.collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static List<Automobile> list() {

		List<Automobile> listAutomobile = new ArrayList<Automobile>();

		Automobile a1 = new Automobile("ABC123", "Agila", 320);
		listAutomobile.add(a1);

		Automobile a2 = new Automobile("CDE456", "Ibiza", 100);
		listAutomobile.add(a2);

		Automobile a3 = new Automobile("FGH789", "Cupra", 400);
		listAutomobile.add(a3);

		listAutomobile.remove(a1);
		
//		System.out.println("Numero di elementi dentro alla lista:" + listAutomobile.size());
//
//		for (int i = 0; i < listAutomobile.size(); i++) { // Concats è come mettere un +
//			System.out.println("Auto " + i + listAutomobile.get(i).getModello().concat(listAutomobile.get(i).getTarga()));
//		}
		return listAutomobile;
	}
}
