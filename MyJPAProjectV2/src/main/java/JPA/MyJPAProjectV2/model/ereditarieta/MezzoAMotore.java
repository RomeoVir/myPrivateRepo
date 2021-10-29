package JPA.MyJPAProjectV2.model.ereditarieta;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//Ho questo errrore ma funziona lo stesso bohh

@Entity(name = "mezzoamotore")//<<<<----importante per eseguire la query!!
@Table(name = "mezzoamotore")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //TABLE_PER_CLASS //JOINED
@NamedQuery(name="mezzoModello", query="SELECT a FROM mezzoamotore a WHERE a.modello LIKE :modello ")
public abstract class MezzoAMotore {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "annoproduzione")
	protected Integer annoProduzione;

	public MezzoAMotore(Integer annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public MezzoAMotore() {
	}

}