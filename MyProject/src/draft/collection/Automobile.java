package draft.collection;

import lombok.Data;

@Data
public class Automobile {
	private String Targa;
	private String Modello;
	private int Cavalli;
	
	public Automobile(String targa, String modello, int cavalli) {
		Targa = targa;
		Modello = modello;
		Cavalli = cavalli;
	}
	
	
}
