import java.util.ArrayList;

public class RemoveDuplicates {
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> result = new ArrayList<>();
	    
	    for (E e: list) {
	      if (!result.contains(e)) 
	        result.add(e);
	    }
	    return result;
	}
}
