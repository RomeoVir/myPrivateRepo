package JPA.MyJPAProjectV2.model.ereditarieta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
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