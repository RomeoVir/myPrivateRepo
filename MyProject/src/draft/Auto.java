package draft;

public class Auto extends Veicolo {

	@Override
	public void accellera(int velocita) {
		schiacciaPedale(velocita);
	}

	private void schiacciaPedale(int velocita) {
	}

	@Override
	public void rallenta(int velocita) {
		schiacciaFreno(velocita);
	}

	private void schiacciaFreno(int velocita) {
	}

}
