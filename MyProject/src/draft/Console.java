package draft;

import java.util.Scanner;

//Find in array
//Questo programma cerca in un array di dimensione data un elemento.
//Cerca quindi con for dentro all'array l'elemento target.
//
//Aggiungo librerie java.util
//Target assegnato come input da console.

public class Console {

	public static void main(String[] args) {

		int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//int target = 5;
		System.out.println("Digitare il numero da cercare:");
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		test(x, target);
		System.out.println(test(x, target));
	}

	private static boolean test(int[] x, int target) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == target) {
				return true;
			}
		}
		return false;
	}

}
