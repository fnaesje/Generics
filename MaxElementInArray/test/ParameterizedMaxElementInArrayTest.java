import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Test;

@RunWith(Parameterized.class)
public class ParameterizedMaxElementInArrayTest {
	private Integer[] input;
	private int expected;
	
	public ParameterizedMaxElementInArrayTest(Integer[] input, Integer expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
	      return Arrays.asList(new Object[][] {
	         { new Integer[] { 1, 2, 3 }, 3},
	         { new Integer[] { -1, -2, -3 }, -1},
	         { new Integer[] { 1 }, 1},
	         { new Integer[] { 1, 1, 1 }, 1},
	         { new Integer[] { 1,-1}, 1 }	         
	         });
 
	}

	@Test
	 public void testVariousInput() {
	  	  assertThat(MaxElements.max(input),equalTo(expected));
	}

}
