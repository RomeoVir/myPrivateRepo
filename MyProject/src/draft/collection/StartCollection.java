package draft.collection;

public class StartCollection {

	public static Runnable main() {

		ListCollection.list();
		SetCollection.set();
		MapCollection.map();
		
		//Aggiunto post ritardo 2,5 secondi
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
