package draft;

public abstract class Veicolo {
	
	private int annoCostruzione;
	
	public abstract void accellera(int velocita);
	public abstract void rallenta(int velocita);
	
	public int getAnnoCostruzione() {
		return annoCostruzione;
	}
	public void setAnnoCostruzione(int annoCostruzione) {
		this.annoCostruzione = annoCostruzione;
	}
	
}
