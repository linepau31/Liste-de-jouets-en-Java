package packageMagasinJouets;

public class jouet implements Comparable<jouet> {
	// attribut, caractéristique des classes -> private
	private String nom; //nom du jouet
	private int prix; // prix du jouet
	private String description; // description du jouet
	private int promo; // promotion du jouet en cours 

	// constructeur
	public jouet(String nom, int prix, String description, int promo) {
		this.nom = nom;
		this.prix = prix;
		this.description = description;
		this.promo = promo;
	}
	
	// methodes pour recuperer les information des jouets
	public String getNom() {
		return nom;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public String getDesc() {
		return description;
	}
	
	public int getPromo() {
		return promo;
	}

	@Override
	public int compareTo(jouet jouet2) {
		
		return this.getNom().compareTo(jouet2.getNom());
	}
	
	
}
