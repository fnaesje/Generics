
public class Driver {
	public static void main(String[] args) {
	    GenericBubbleSort gbs = new GenericBubbleSort();
		Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
	    gbs.bubbleSort(list);
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	}

}
