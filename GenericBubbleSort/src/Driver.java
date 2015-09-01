
public class Driver {
	public static void main(String[] args) {
	    Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
	    GenericBubbleSort.bubbleSort(list);
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	}

}
