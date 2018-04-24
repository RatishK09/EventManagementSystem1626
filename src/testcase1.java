import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase1 {

	@Test
	void test() {
		Options op1 = new Options("Air Hall",200);
		assertEquals(200, op1.Price);
	}

}
