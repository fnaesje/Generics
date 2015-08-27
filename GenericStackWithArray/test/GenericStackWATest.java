import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class GenericStackWATest {
	private GenericStackWA<Integer> stack;
    
	@Before
	public  void setUp()  {
		stack = new GenericStackWA<Integer>();
	}
	@Test
	public void initialStack_StackShouldBeEmpty() {
		
		assertTrue("Was not empty initially", stack.isEmpty());
	}
	@Test
	public void pushOneValue_StackShouldNotBeEmpty() {
		stack.push(1);
		assertFalse("Was empty after one push", stack.isEmpty());
	}

	@Test
	public void toString_pushOneValue_ShouldReturnAStringWithSameValue() {
		stack.push(1);
		assertThat("Did not return 1", stack.toString(), equalTo("1"));
	}
	
	@Test
	public void pushingAndPopping_ShouldGiveEmpyStack() {
		stack.push(1);
		stack.pop();
		assertTrue("Was not empty after push and pop", stack.isEmpty());
	}
	@Test
	public void pushOneAndTwo_ShouldReturnOneAndTwoAsString() {
		stack.push(1);
		stack.push(2);
		assertThat("Did not return 2,1", stack.toString(), is(equalTo("2,1")));
	}
	
	@Test
	public void pushAndPop_ShouldReturnEmptyString() {
		stack.push(1);
		stack.pop();
		assertThat("Did not return empty string", stack.toString(), is(equalTo("")));
	}
	
}
