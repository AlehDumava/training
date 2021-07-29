package Action;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domain.Sweets;

public class SortCandyByWeight<T> implements SortCandy<T> {

	public void sort(List<Sweets> candy, SortCandy<Sweets> s, Comparator<Sweets> c) {
		s.sortCandy(candy, c);
	}
	
	@Override
	public void sortCandy(List<T> objects, Comparator<T> c) {

		Collections.sort(objects, c);
		
	}
}
	

