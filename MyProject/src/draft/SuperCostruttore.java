package draft;

public class SuperCostruttore {
	private String nome;
	private String Oggetto;
	
	
	public SuperCostruttore(String nome, String oggetto) {
		this.nome = nome;
		Oggetto = oggetto;
	}
	public String getOggetto() {
		return Oggetto;
	}
	public void setOggetto(String oggetto) {
		Oggetto = oggetto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
