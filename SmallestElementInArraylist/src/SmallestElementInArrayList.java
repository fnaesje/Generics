import java.util.ArrayList;

import org.hamcrest.Matcher;

public class SmallestElementInArrayList {

	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		E min = list.get(0);
		
		for (int i = 1; i < list.size(); i++)
			if (min.compareTo(list.get(i)) > 0)
				min = list.get(i);
		return min;
	}
}
