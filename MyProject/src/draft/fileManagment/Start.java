package draft.fileManagment;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import draft.collection.Automobile;
import draft.collection.ListCollection;

public class Start {

	public static void main(String[] args) {
		String oggetto = "Testo all'interno del file di test!";
		String percorsoCreato = "testfile/test.txt";
		writeFile(percorsoCreato, oggetto);
		readFile(percorsoCreato);
		String percorsoEliminato = "testfile/test.txt";
		deleteFile(percorsoEliminato);
		List<Automobile> listAutomobile = ListCollection.list();
		totaleAutomobili(listAutomobile);

	}

	private static String totaleAutomobili(List<Automobile> listAutomobile) {
		try {
			File file = new File("testfile/auto.txt");

			String oggetto = null; // concatenare stringa

			// System.out.println("Numero di elementi dentro alla lista totale:" +
			// listAutomobile.size());

			for (int i = 0; i < listAutomobile.size(); i++) {
				oggetto = (i + listAutomobile.get(i).getModello() + listAutomobile.get(i).getTarga()
						+ listAutomobile.get(i).getCavalli());
			}
			
			FileUtils.writeStringToFile(file, oggetto, "UTF-8");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}

	public static void writeFile(String percorsoCreato, String oggetto) {
		try {
			File file = new File(percorsoCreato);
			FileUtils.writeStringToFile(file, oggetto, "UTF-8");
			System.out.println("File creato.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deleteFile(String percorsoEliminato) {
		File file = new File(percorsoEliminato);
		try {
			FileUtils.delete(file);
			System.out.println("File eliminato.");
		} catch (IOException e) {
			System.out.println("!!! File non trovato.");
		}
	}

	public static void readFile(String percorsoCreato) {
		try {
			File file = new File(percorsoCreato);
			String lettura = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(lettura);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
