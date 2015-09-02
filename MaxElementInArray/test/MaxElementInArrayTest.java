import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class MaxElementInArrayTest {

	@Test
	public void ArrayWithSingleIntegerShouldReturnThatInteger() {
		Integer[] integerArr = {1};
		assertThat(MaxElements.max(integerArr),equalTo(integerArr[0]));
	}
	@Test
	public void MaxOfThreeWithPositiveIntegers() {
		Integer[] integerArr = {1,2,3};
		assertThat(MaxElements.max(integerArr),equalTo(3));
	}
	@Test
	public void MaxOfThreeWithNegativeIntegers() {
		Integer[] integerArr = {-1,-2,-3};
		assertThat(MaxElements.max(integerArr),equalTo(-1));
	}
	@Test
	public void MaxOfOneCircleShouldReturnThatCircle() {
		Circle[] circles = {new Circle(3.0)};
		assertThat(MaxElements.max(circles),equalTo(circles[0]));
	}
}
