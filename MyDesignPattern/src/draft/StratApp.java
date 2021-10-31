package draft;

import draft.singleton.Singleton;

public class StratApp {

	public static void main(String[] args) {
		// Il singleton non mi permette di fare Singelton oggetto = new Singleton();

		Singleton oggetto = Singleton.getInstance();
		oggetto.somma(10, 5);
		oggetto.somma(9, 9);
	}

}
