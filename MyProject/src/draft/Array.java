package draft;

//Find in array
//Questo programma cerca in un array di dimensione data un elemento.
//Cerca quindi con for dentro all'array l'elemento target.

public class Array {

	public static void main(String[] args) {

		int x[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 5;
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
