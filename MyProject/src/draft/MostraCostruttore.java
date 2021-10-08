package draft;

public class MostraCostruttore {

	public static void show() {

		CostruttoreMacchina Modello1 = new CostruttoreMacchina();

		System.out.println(Modello1.getCavalli() + Modello1.getMarca() + Modello1.getModello());
	}

}
