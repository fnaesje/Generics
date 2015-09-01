import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void AListWithAllDifferentValues_ShouldReturnSameAList() {
		ArrayList<Integer> iList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> result = RemoveDuplicates.removeDuplicates(iList);
		assertThat(result, equalTo(iList));
	}
	
	@Test
	public void AListWithDuplicates_ShouldReturnDuplicatesRemoved() {
		ArrayList<Integer> iList = new ArrayList<>(Arrays.asList(1,2,1,4,2));
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,4));
		assertThat(RemoveDuplicates.removeDuplicates(iList), equalTo(expected));
	}
}
