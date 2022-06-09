package packageMagasinJouets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// créer une liste qui va stocker le nom de plusieurd jouets
		List<jouet> jouets = new ArrayList<>();
		jouets.add(new jouet("Scrubble Deluxe", 20, "Petit jeu de société", 5));
		jouets.add(new jouet("Figurine manga", 30, "Figurine", 15));
		jouets.add(new jouet("Peluche chien", 10, "Peluche", 5));
		jouets.add(new jouet("Ligo Start wars", 110, "ligo box de start wars", 80));
		jouets.add(new jouet("Figurine animaux", 6, "Figurine", 5));
		jouets.add(new jouet("Peluche chat", 10, "Peluche", 5));
		jouets.add(new jouet("Blaymobile", 30, "Box de Blaymobile", 20));
		jouets.add(new jouet("Battle royal", 20, "Jeux de baitaille de bateaux", 10));
		jouets.add(new jouet("Lu Garu", 15, "Jeu de rôles", 10));
		jouets.add(new jouet("Osobot Evo", 70, "robot pour apprendre à dev", 40));
		
		
		//affiche la liste à nouveau (alphabetique)
		for(jouet jouet : jouets) { 
			System.out.println("Jouet : " + jouet.getNom() + "("+ jouet.getPrix() +"€) " + jouet.getDesc() + " (promo : " + jouet.getPromo() + "% de reduction)");
		}
		
		// Trie qui compare la liste des jouets
		Collections.sort(jouets, new PrixComparator());
		
		System.out.println("------ TRI EN COURS --------");
		
		//affiche la liste à nouveau
		for(jouet jouet : jouets) { 
			System.out.println("Jouet : " + jouet.getNom() + "("+ jouet.getPrix() +"€) " + jouet.getDesc() + " (promo : " + jouet.getPromo() + "% de reduction)");
		}
	}
}
