package JPA.MyJPAProjectV2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	public Studente() {
	}
			
	public Studente( String nome, String cognome, int voto) {
		this.nome = nome;
		this.cognome = cognome;
		this.voto = voto;
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

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", voto=" + voto + "]";
	}

	
}
