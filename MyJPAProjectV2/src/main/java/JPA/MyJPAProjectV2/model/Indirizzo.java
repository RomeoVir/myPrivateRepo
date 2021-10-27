package JPA.MyJPAProjectV2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

// + Persone a 1 Paese

@Data
@Entity
@Table(name = "indirizzo_PK3")
public class Indirizzo {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(mappedBy="indirizzo")
	private Studente studente;
	
	@Column(name = "paese")
	private String paese;
	private int numero;

	public Indirizzo() {
	}

	public Indirizzo(String paese, int numero) {
		this.paese = paese;
		this.numero = numero;
	}

}
