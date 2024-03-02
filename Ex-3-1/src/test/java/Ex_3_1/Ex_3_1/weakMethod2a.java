package Ex_3_1.Ex_3_1;

import org.junit.Test;

import Ex_3_1.Ex_3_1.WeakClass;

public class weakMethod2a {
	
	// Division by zero error
	@Test(expected = ArithmeticException.class)
	public void WeakMethodZero2() {
		WeakClass.weakMethod2(5,0);
	}

}
