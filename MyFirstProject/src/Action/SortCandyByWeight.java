package Action;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortCandyByWeight<T> implements SortCandy<T> {

	public void sort(List<T> candy, SortCandy<T> s, Comparator<T> c) {
		
		s.sortCandy(candy, c);
	}
	
	@Override
	public void sortCandy(List<T> objects, Comparator<T> c) {

		Collections.sort(objects, c);
		
	}
}
	

