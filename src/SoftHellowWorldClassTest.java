import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SoftHellowWorldClassTest {

	@Test
	void test() {
		SoftHellowWorldClass sh=new SoftHellowWorldClass();
		String result="Hello Word";
		assertEquals(sh.PrintHelow(),result);
	}

}
