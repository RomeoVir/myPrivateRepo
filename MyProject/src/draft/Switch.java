package draft;

import java.util.Scanner;
//In questa classe creo un selettore che richiama a programmi 
//dentro lo stesso package.
//Input da console.

public class Switch {

	public static void main() {
		System.out.println("Digitare programma da eseguire:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String programma = input.nextLine();
		//while(!programma.contentEquals("Exit")) {
			switch (programma) {
			case "Array":
				Array.main();
				break;
			case "Console":
				Console.main();
				break;
			case "ConsoleExtended":
				ConsoleExtended.main();
				break;
			case "1":
				CompilaCostruttore.main();
				break;
			case "2":
				MostraOggetto.show();
				break;
			
			//}
		}
	}
}
