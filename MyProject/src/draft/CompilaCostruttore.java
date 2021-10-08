package draft;

import java.util.Scanner;

public class CompilaCostruttore {

	public static void main() {
		//Cavalli, Marca, Modello
		CostruttoreMacchina Modello1 = new CostruttoreMacchina();
		System.out.println("Digitare il numero di cavalli del Modello 1:");
		Scanner input = new Scanner(System.in);
		int risultato = input.nextInt();
		Modello1.setCavalli(risultato);
		System.out.println("Digitare la marca del Modello 1:");
		String risultato2 = input.next();
		Modello1.setMarca(risultato2);
		System.out.println("Digitare il nome del Modello 1:");
		String risultato3 = input.next();
		Modello1.setModello(risultato3);
		input.close();
	}

}
