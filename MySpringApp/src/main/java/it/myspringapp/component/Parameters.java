package it.myspringapp.component;

import org.springframework.beans.factory.annotation.Value;

//@Data
public class Parameters {

	// Recupero valori dalL'application.properties
	@Value("${Hello.valore1}")
	private int valore1;

	@Value("${Hello.valore2}")
	private int valore2;

	public int getValore1() {
		return valore1;
	}

	public void setValore1(int valore1) {
		this.valore1 = valore1;
	}

	public int getValore2() {
		return valore2;
	}

	public void setValore2(int valore2) {
		this.valore2 = valore2;
	}
	
}
