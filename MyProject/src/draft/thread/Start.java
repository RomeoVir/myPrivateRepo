package draft.thread;

import draft.SimpleSyout;
import draft.collection.StartCollection;

public class Start {
	public static void main(String[] args) {
		try {
			
			Thread es1 = new Thread(StartCollection.main());
			Thread es2 = new Thread(SimpleSyout.main());

			es1.start();
			
			es1.join();
			//Ritardo di 2,5 secondi dentro a StartCollection.main()
			es2.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
