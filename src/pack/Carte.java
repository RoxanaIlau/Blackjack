package pack;

public class Carte {

	String simbol;
	String culoare;
	int valoare;

	public Carte() {
	}

	public Carte(String simbol, String culoare, int valoare) {
		super();
		this.simbol = simbol;
		this.culoare = culoare;
		this.valoare = valoare;
	}

	@Override
	public String toString() {
		return "\nCarte " + simbol + " " + culoare + ", valoare=" + valoare;
	}

}