package draft;

import draft.Console;

public class ConsoleExtended extends Console {
	
	//Da documentazione
//	@Override
//	public static void main() {
//		ConsoleExtended myConsoleExtended = new ConsoleExtended();
//		Console myConsole = myConsoleExtended;
//		Console.main();
//		
//	}
	
	public static String test(int[] x, int target) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == target) {
				return "Presente programma Extended";
			}
		}
		return "Assente programma Extended";
	}

}
