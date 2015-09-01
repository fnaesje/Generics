import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Before;
import org.junit.Test;

public class GenericBubbleSortTest {
	GenericBubbleSort bsObject;
	
	@Test
	public void sort12_shouldreturn12() {
		Integer [] input = {1,2};
		Integer [] correctResult = {1,2};
		GenericBubbleSort.bubbleSort(input);
		assertThat(input,is(equalTo(correctResult)));
	}
	@Test
	public void sort21_shouldreturn12() {
		Integer [] input = {2,1};
		Integer [] correctResult = {1,2};
		GenericBubbleSort.bubbleSort(input);
		assertThat(input,is(equalTo(correctResult)));
	}
	@Test
	public void sort10to0_shouldreturn0to10() {
		Integer [] input = {10,9,8,7,6,5,4,3,2,1,0};
		Integer [] correctResult = {0,1,2,3,4,5,6,7,8,9,10};
		GenericBubbleSort.bubbleSort(input);
		assertThat(input,is(equalTo(correctResult)));
	}
	@Test
	public void sortnegativeNumbers_shouldWork() {
		Integer [] input = {10,9,8,7,6,-5,4,3,2,1,0};
		Integer [] correctResult = {-5,0,1,2,3,4,6,7,8,9,10};
		GenericBubbleSort.bubbleSort(input);
		assertThat(input,is(equalTo(correctResult)));
	}
}
