package draft.lambda;

public class Start {
	
	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("Hello world lambda!!!");
		r1.run();
	}
}
