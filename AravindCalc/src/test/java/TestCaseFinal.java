import static org.junit.Assert.*;

import org.junit.Test;

import AravindCalc.AravindCalc.App;

public class TestCaseFinal {

	@Test
	public void test() {
			assertEquals("Postive add matching :",3,App.add(2, 1));
			assertEquals("Nagative add matching :",-6,App.add(-1, -5));
			assertEquals("Zero add matching :",1,App.add(1, 0));
	}
}
