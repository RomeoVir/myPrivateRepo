package JPA.MyJPAProjectV2.model.ereditarieta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;



@Entity
public class Automobile extends MezzoAMotore {

	@Column(name = "ruote")
	private Integer ruote;

	@Column(name = "modello")
	private String modello;

	
	public Automobile() {
		
	}
	public Integer getRuote() {
		return ruote;
	}

	public void setRuote(Integer ruote) {
		this.ruote = ruote;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Automobile(Integer annoProduzione, Integer ruote,String modello) {
		super(annoProduzione);
		this.ruote = ruote;
		this.modello = modello;
	}

}
