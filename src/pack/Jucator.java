package pack;

import java.util.ArrayList;

public class Jucator {
	String nume;
	int puncte;
	ArrayList<Carte> carti = new ArrayList<Carte>();

	public int calculeazaPuncte() {
		puncte = 0;
		for (Carte c : carti) {
			puncte += c.valoare;

		}
		return puncte;

	}

	public Jucator(String nume, int puncte, ArrayList<Carte> carti) {
		super();
		this.nume = nume;
		this.puncte = puncte;
		this.carti = carti;
	}

	public Jucator(String nume) {
		super();
		this.nume = nume;
	}

	public void afisareCartiJucatori() {
		System.out.println(carti);

	}

	public void afisarePuncteJucatori() {
		System.out.println(calculeazaPuncte());

	}

}
