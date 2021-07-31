package Action;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import domain.Sweets;

public class FindCandyByShugarContent {

	public void find(int a, int b) {
		
		Comparator<Sweets> newFind = new Comparator<Sweets>() {
			public int compare(Sweets u1, Sweets u2) {
				
				return  u1.getShugarContent().compareTo(u2.getShugarContent());
			}
			
		};
		
	//	int index = Collections.binarySearch(candy, 4, newFind);
	}	
	
	public int compare(Sweets p1, Sweets p2) {
		
		return Long.compare(p1.getShugarContent(), p2.getShugarContent());
	}
	
}
