package Ex_3_1.Ex_3_1;
import org.junit.Test;

import Ex_3_1.Ex_3_1.WeakClass;

public class WeakMethod1a {
	
	// Error will be caught here. Test with less than 100% coverage
	@Test(expected = ArithmeticException.class)
	public void WeakMethodZero1() {
		WeakClass.weakMethod1(10, 0);
	}

}
