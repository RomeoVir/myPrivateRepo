package JPA.MyJPAProjectV2.model.ereditarieta;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Aereo extends MezzoAMotore {

	@Column(name = "eliche")
	private Integer eliche;

	@Column(name = "modello")
	private String modello;

	public Aereo() {
	}

	public Aereo(Integer annoProduzione, Integer eliche, String modello) {
		super(annoProduzione);
		this.eliche = eliche;
		this.modello = modello;
	}

	public Integer getEliche() {
		return eliche;
	}

	public void setEliche(Integer eliche) {
		this.eliche = eliche;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	@Override
	public String toString() {
		return "Aereo [Anno di Produzione="+ annoProduzione + ", eliche=" + eliche + ", modello=" + modello + "]";
	}

	
}
