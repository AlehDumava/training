package Action;

import java.util.Comparator;

import domain.Sweets;

public class WeightComparator implements Comparator<Sweets> {
	
	public int compare(Sweets p1, Sweets p2) {
		
		return Long.compare(p1.getWeight(), p2.getWeight());
	}
}
