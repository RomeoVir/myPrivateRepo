package draft;


public class ConsoleExtended extends Console {
	
	public static void main() {
		String campoFinale = "Il numero è " + test(x, input());
		System.out.println(campoFinale);
	}
	
	public static String test(int[] x, int target) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == target) {
				return "Presente programma Extended";
			}
		}
		return "Assente programma Extended";
	}

}
