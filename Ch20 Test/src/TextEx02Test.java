import static org.junit.Assert.*;

import org.junit.Test;

public class TextEx02Test {

	@Test
	public void testPlus() {
		
		int result;
		result = TextEx02.plus(10, 20);
		assertEquals(30, result);
		
		result = TextEx02.plus(20, 30);
		assertEquals(50, result);
	}

}
