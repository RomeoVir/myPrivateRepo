package draft.collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void set() {

		Set<Automobile> setAutomobile = new HashSet<Automobile>();
		
		Automobile a1 = new Automobile("ABC123","Agila", 320);
		setAutomobile.add(a1);
		
		Automobile a2 = new Automobile("CDE456","Ibiza", 100);
		setAutomobile.add(a2);
		
		Automobile a3 = new Automobile("FGH789","Cupra", 400);
		setAutomobile.add(a3);
		
		
		System.out.println("Numero di elementi dentro al Set:" + setAutomobile.size());
	}

}
