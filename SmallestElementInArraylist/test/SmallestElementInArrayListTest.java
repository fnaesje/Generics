import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class SmallestElementInArrayListTest {

	
	@Test
	public void listWithOneElementShouldreturnThatElement() {
		ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1));
		assertThat(SmallestElementInArrayList.min(integerList), equalTo(1));
	}
	@Test
	public void listWithOneNegativeElementShouldreturnThatElement() {
		ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1,-1));
		assertThat(SmallestElementInArrayList.min(integerList), equalTo(-1));
	}

}
