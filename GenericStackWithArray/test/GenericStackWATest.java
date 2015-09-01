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
	public void pushAValue_thenStackShouldNotBeEmpty() {
		stack.push(1);
		assertFalse(stack.isEmpty());
	}

	@Test
	public void peekafterPush_ShouldReturnSameValue() {
		stack.push(1);
		assertThat(stack.peek(), is(equalTo(1)));
	}
	
	@Test
	public void pushingAndPopping_ShouldGiveEmpyStack() {
		stack.push(1);
		stack.pop();
		assertTrue("Was not empty after push and pop", stack.isEmpty());
	}
	@Test
	public void pushTwoValues_ShouldReturnLastPushed() {
		stack.push(1);
		stack.push(2);
		assertThat("Did not pop last value", stack.pop(), is(equalTo(2)));
	}
	
	@Test
	public void pushAndPop_ShouldResultInEmptyStack() {
		stack.push(1);
		stack.pop();
		assertThat("Stack not empty but should be", stack.isEmpty(), is(true));
	}
	
}
