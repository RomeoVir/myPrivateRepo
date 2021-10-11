package draft;

import java.util.Scanner;

public class CompilaCostruttore {

	public static void main() {
		//Super Nome e Oggetto
		//Cavalli, Marca, Modello
		CostruttoreMacchina ModelloAuto = new CostruttoreMacchina(null, null, 0, null, null);
		System.out.println("Digitare il numero di cavalli del Modello 1:");
		Scanner input = new Scanner(System.in);
		int risultato = input.nextInt();
		ModelloAuto.setCavalli(risultato);
		System.out.println("Digitare la marca del Modello 1:");
		String risultato2 = input.next();
		ModelloAuto.setMarca(risultato2);
		System.out.println("Digitare il nome del Modello 1:");
		String risultato3 = input.next();
		ModelloAuto.setModello(risultato3);
		
		//Cilindrata, MArca, Modello
		CostruttoreMoto ModelloMoto = new CostruttoreMoto (null, null, 0, null, null);
		System.out.println("Digitare il numero di cilindraya del Modello 2:");
		int risultatoMoto = input.nextInt();
		ModelloMoto.setCilindrata(risultatoMoto);
		System.out.println("Digitare la marca del Modello 2:");
		String risultatoMoto2 = input.next();
		ModelloMoto.setMarca(risultatoMoto2);
		System.out.println("Digitare il nome del Modello 2:");
		String risultatoMoto3 = input.next();
		ModelloMoto.setModello(risultatoMoto3);
		input.close();
	}

}
