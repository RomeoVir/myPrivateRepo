package draft;

public class MostraOggetto {

	public static void show() {

		CostruttoreMacchina Modello1 = new CostruttoreMacchina(null, null, 0, null, null);

		System.out.println(Modello1.getCavalli() + Modello1.getMarca() + Modello1.getModello());
	}

}
