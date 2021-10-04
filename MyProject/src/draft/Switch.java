package draft;

import java.util.Scanner;
//In questa classe creo un selettore che richiama a programmi 
//dentro lo stesso package.
//Input da console.

public class Switch {

	public static void main(String[] args) {
		System.out.println("Digitare programma da eseguire:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String programma = input.nextLine();

		switch (programma) {
		case "Array":
			Array.main();
			break;
		case "Console":
			Console.main();
			break;
		default:
			System.out.println("Digitazione errata.");
		}
	}
}
