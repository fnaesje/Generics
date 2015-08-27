import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Before;
import org.junit.Test;

public class GenericBubbleSortTest {
	GenericBubbleSort<Integer> bsObject;
	@Before
	public void setUp() {
		bsObject = new GenericBubbleSort<Integer>();
	}

	@Test
	public void sort12_shouldreturn12() {
		Integer [] input = {1,2};
		Integer [] correctResult = {1,2};
		bsObject.bubbleSort(input);
		assertThat("1,2 was not sorted to 1, 2",input,is(equalTo(correctResult)));
	}
	@Test
	public void sort21_shouldreturn12() {
		Integer [] input = {2,1};
		Integer [] correctResult = {1,2};
		bsObject.bubbleSort(input);
		assertThat("2,1 was not sorted to 1, 2",input,is(equalTo(correctResult)));
	}
}
