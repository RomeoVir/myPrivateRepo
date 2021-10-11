package draft;

public class Moto extends Veicolo{

	@Override
	public void accellera(int velocita) {
		giraManopola(velocita);
	}

	private void giraManopola(int velocita) {
		
	}

	@Override
	public void rallenta(int velocita) {
		schiacciaPedale(velocita);
	}

	private void schiacciaPedale(int velocita) {
		
	}

}
