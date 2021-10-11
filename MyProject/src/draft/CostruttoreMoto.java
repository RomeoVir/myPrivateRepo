package draft;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CostruttoreMoto extends SuperCostruttore{
	
	
	private int cilindrata;
	private String marca;
	private String modello;
	
	
	public CostruttoreMoto(String nome, String oggetto, int cilindrata, String marca, String modello) {
		super(nome, oggetto);
		this.cilindrata = cilindrata;
		this.marca = marca;
		this.modello = modello;
	}
	
	

	
}
