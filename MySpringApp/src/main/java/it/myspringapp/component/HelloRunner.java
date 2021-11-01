package it.myspringapp.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloRunner implements CommandLineRunner {
	
	
	public void run(String[] args) {
		System.out.println("Hello my first Spring App");
		//Non penso si faccia così ma funziona
//		Parameters parametri = new Parameters();
//		parametri.setValore1(10);		
//		int valore1 = parametri.getValore1();
//		parametri.setValore2(10);
//		int valore2 = parametri.getValore2();
//		int risultato;
//		risultato = (valore1 + valore2);
//		System.out.println(risultato);

	}

}
