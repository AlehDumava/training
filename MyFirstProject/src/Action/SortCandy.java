package Action;

import java.util.Comparator;
import java.util.List;

interface SortCandy<T> {

	public void sortCandy(List<T> objects, Comparator<T> c);

}
