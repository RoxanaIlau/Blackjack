package pack;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Principala {
	static Scanner sc = new Scanner(System.in);
	static Jucator user1 = new Jucator("Roxana");
	static Jucator user2 = new Jucator("Dealer");
	static ArrayList<Carte> pachetCarti = new ArrayList<Carte>();

	public static void main(String[] args) {

		pachetCarti.add(new Carte("2", "\u2665", 2));
		pachetCarti.add(new Carte("2", "\u2666", 2));
		pachetCarti.add(new Carte("2", "\u2663", 2));
		pachetCarti.add(new Carte("2", "\u2660", 2));

		pachetCarti.add(new Carte("3", "\u2665", 3));
		pachetCarti.add(new Carte("3", "\u2666", 3));
		pachetCarti.add(new Carte("3", "\u2663", 3));
		pachetCarti.add(new Carte("3", "\u2660", 3));

		pachetCarti.add(new Carte("4", "\u2665", 4));
		pachetCarti.add(new Carte("4", "\u2666", 4));
		pachetCarti.add(new Carte("4", "\u2663", 4));
		pachetCarti.add(new Carte("4", "\u2660", 4));

		pachetCarti.add(new Carte("5", "\u2665", 5));
		pachetCarti.add(new Carte("5", "\u2666", 5));
		pachetCarti.add(new Carte("5", "\u2663", 5));
		pachetCarti.add(new Carte("5", "\u2660", 5));

		pachetCarti.add(new Carte("6", "\u2665", 6));
		pachetCarti.add(new Carte("6", "\u2666", 6));
		pachetCarti.add(new Carte("6", "\u2663", 6));
		pachetCarti.add(new Carte("6", "\u2660", 6));

		pachetCarti.add(new Carte("7", "\u2665", 7));
		pachetCarti.add(new Carte("7", "\u2666", 7));
		pachetCarti.add(new Carte("7", "\u2663", 7));
		pachetCarti.add(new Carte("7", "\u2660", 7));

		pachetCarti.add(new Carte("8", "\u2665", 8));
		pachetCarti.add(new Carte("8", "\u2666", 8));
		pachetCarti.add(new Carte("8", "\u2663", 8));
		pachetCarti.add(new Carte("8", "\u2660", 8));

		pachetCarti.add(new Carte("9", "\u2665", 9));
		pachetCarti.add(new Carte("9", "\u2666", 9));
		pachetCarti.add(new Carte("9", "\u2663", 9));
		pachetCarti.add(new Carte("9", "\u2660", 9));

		pachetCarti.add(new Carte("10", "\u2665", 10));
		pachetCarti.add(new Carte("10", "\u2666", 10));
		pachetCarti.add(new Carte("10", "\u2663", 10));
		pachetCarti.add(new Carte("10", "\u2660", 10));

		pachetCarti.add(new Carte("A", "\u2665", 10));
		pachetCarti.add(new Carte("A", "\u2666", 10));
		pachetCarti.add(new Carte("A", "\u2663", 10));
		pachetCarti.add(new Carte("A", "\u2660", 10));

		pachetCarti.add(new Carte("J", "\u2665", 10));
		pachetCarti.add(new Carte("J", "\u2666", 10));
		pachetCarti.add(new Carte("J", "\u2663", 10));
		pachetCarti.add(new Carte("J", "\u2660", 10));

		pachetCarti.add(new Carte("Q", "\u2665", 10));
		pachetCarti.add(new Carte("Q", "\u2666", 10));
		pachetCarti.add(new Carte("Q", "\u2663", 10));
		pachetCarti.add(new Carte("Q", "\u2660", 10));

		pachetCarti.add(new Carte("K", "\u2665", 10));
		pachetCarti.add(new Carte("K", "\u2666", 10));
		pachetCarti.add(new Carte("K", "\u2663", 10));
		pachetCarti.add(new Carte("K", "\u2660", 10));

		// System.out.println(pachetCarti);
		Collections.shuffle(pachetCarti);

		System.out.println("Roxana:");
		System.out.println();
		trageCarte(user1);
		trageCarte(user1);
		user1.afisareCartiJucatori();
		System.out.println("Total puncte: ");
		user1.afisarePuncteJucatori();

		System.out.println("Dealer:");
		trageCarte(user2);
		trageCarte(user2);
		user2.afisareCartiJucatori();
		System.out.println("Total puncte: ");
		user2.afisarePuncteJucatori();

		while (true) {
			System.out.println("Mai doriti carti? Y/N ");
			String raspuns = sc.nextLine();
			if (raspuns.equalsIgnoreCase("Y")) {
				trageCarte(user1);
				user1.afisareCartiJucatori();
				System.out.println("Total puncte: ");
				user1.afisarePuncteJucatori();
				// se verifica daca sunt indeplinite conditiile jocului
				if (user1.calculeazaPuncte() > 21) {
					System.out.println("Ai pierdut!");
					break;
				}
				if (user1.calculeazaPuncte() == 21) {
					System.out.println("Black Jack");
					break;
				}
			} else {

				// user2 targe carti pana >= jucator sau >=21
				while (user1.calculeazaPuncte() > user2.calculeazaPuncte()) {
					trageCarte(user2);
					user2.afisareCartiJucatori();

				}
				if (user2.calculeazaPuncte() > 21) {
					System.out.println("Total puncte: ");
					user2.afisarePuncteJucatori();
					System.out.println("Felicitari! Ai castigat");
					break;
				}
				if (user1.calculeazaPuncte() == user2.calculeazaPuncte()) {
					System.out.println("Remiza");
				} else {
					System.out.println("Ai pierdut");
					break;
				}

				break;
			}

		}
	}

	private static void trageCarte(Jucator juc) {
		Carte carte = pachetCarti.remove(pachetCarti.size() - 1);
		juc.carti.add(carte);
	}
}
