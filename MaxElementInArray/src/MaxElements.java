
public class MaxElements {

	public static <E extends Comparable<E>>E max(E[] arr) {
		E max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max.compareTo(arr[i]) < 0)
				max = arr[i];
		}
		return max;
	}

}