package draft;

public abstract class Veicolo implements MezzoDiTrasporto {

	private int annoCostruzione;
	private int velocita;

	public void accellera(int velocita) {
		this.velocita = velocita;
	}

	public abstract void rallenta(int velocita);

	public int getAnnoCostruzione() {
		return annoCostruzione;
	}

	public void setAnnoCostruzione(int annoCostruzione) {
		this.annoCostruzione = annoCostruzione;
	}

	public int getVelocita() {
		return this.velocita = velocita;
	}

}
