package draft.singleton;

public class Singleton {

	private static Singleton istanza = new Singleton();
	
	public static Singleton getInstance() {
		System.out.println("Singleton created ");
		return istanza;
	}

	private Singleton() {
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public int somma(int uno, int due) {
		int risultato = uno + due;
		System.out.println("Somma: " + uno + " + " + due + " = " + risultato);
		return risultato;
	}

}
