package draft;

import java.util.Scanner;

//Find in array
//Questo programma cerca in un array di dimensione data un elemento.
//Cerca quindi con for dentro all'array l'elemento target.
//
//Aggiungo librerie java.util
//Target assegnato come input da console.
//

public class Console {
	
	protected static int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	
	public static void main() {

		
		//input(numero); In questo modo si ripeteva 3 volte - 1
		//test(x, input(numero));// -2 
		String campoFinale = "Il numero è " + test(x, input());// -3
		System.out.println(campoFinale);
	}

	protected static int input() {
		System.out.println("Digitare il numero da cercare:");
		Scanner input = new Scanner(System.in);
		int risultato = input.nextInt();
		input.close();
		return risultato;
	}

	public static String test(int[] x, int target) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == target) {
				return "Presente";
			}
		}
		return "Assente";
	}

}
