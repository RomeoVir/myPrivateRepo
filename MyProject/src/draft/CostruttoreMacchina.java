package draft;

public class CostruttoreMacchina extends SuperCostruttore {

	private int cavalli;
	private String marca;
	private String modello;

	public CostruttoreMacchina(String nome, String oggetto, int cavalli, String marca, String modello) {
		super(nome, oggetto);
		this.cavalli = cavalli;
		this.marca = marca;
		this.modello = modello;
	}

	public int getCavalli() {
		return cavalli;
	}

	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

}
