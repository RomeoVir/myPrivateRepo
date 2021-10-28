package JPA.MyJPAProjectV2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Data
@Entity
@Table(name="studente_PK3")
public class Studente {

	@Id
	@Column(name= "id")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "nome")
	private String nome;
	private String cognome;
	private int voto;
	
	@OneToOne
	private Indirizzo indirizzo;
	
	public Studente() {
	}
			
	public Studente( String nome, String cognome, int voto, Indirizzo indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.voto = voto;
		this.indirizzo = indirizzo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", voto=" + voto + ", indirizzo="
				+ indirizzo + "]";
	}

	public Indirizzo getStudente(){
		this.getStudente();
		return indirizzo;}
	
}
