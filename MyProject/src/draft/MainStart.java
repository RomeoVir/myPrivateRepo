package draft;

import java.util.Scanner;

public class MainStart {

	public static void main(String[] args) {
		// for (int i = 0; i == 2; i++) {
		System.out.println("Vuoi eseguire? Y/N: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String YN = input.next();
		do{
			Switch.main();
		} while (YN.contains("N")); 
		// }
	}
}
