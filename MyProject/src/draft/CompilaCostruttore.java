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
		input.close();
		
		//Cilindrata, MArca, Modello
		CostruttoreMoto ModelloMoto = new CostruttoreMoto (null, null, 0, null, null);
		System.out.println("Digitare il numero di cavalli del Modello 1:");
		Scanner moto = new Scanner(System.in);
		int risultatoMoto = moto.nextInt();
		ModelloMoto.setCilindrata(risultatoMoto);
		System.out.println("Digitare la marca del Modello 1:");
		String risultatoMoto2 = moto.next();
		ModelloMoto.setMarca(risultatoMoto2);
		System.out.println("Digitare il nome del Modello 1:");
		String risultatoMoto3 = moto.next();
		ModelloMoto.setModello(risultatoMoto3);
		moto.close();
	}

}
