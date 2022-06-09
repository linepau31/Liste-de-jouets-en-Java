package packageMagasinJouets;

import java.util.Comparator;

public class PrixComparator implements Comparator<jouet> {

		@Override
		public int compare(jouet jouet1, jouet jouet2) {
			
			// je compare le prix
			if(jouet1.getPrix() == (jouet2.getPrix()))
			{
				return jouet1.compareTo(jouet2);// comparaison du nom
			}
			
			return jouet2.getPrix() - jouet1.getPrix();
		}	
}
