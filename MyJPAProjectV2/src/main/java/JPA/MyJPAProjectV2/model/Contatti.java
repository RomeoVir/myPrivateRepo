package JPA.MyJPAProjectV2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "contatti_PK3")
public class Contatti {
	
	@Id
	@Column(name = "id")
	private long id;
	
	@Column
	private String nome;
	private String cognome;
	private String nTelefono;
	
	@OneToMany(mappedBy="contatti")
	private List<Telefono> listaTelefono;
	
	
}
