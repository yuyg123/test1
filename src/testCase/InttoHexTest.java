package testCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import test1.InttoHex;

public class InttoHexTest {
	private InttoHex inttoHex;

	@Before
	public void setUp() throws Exception {
		inttoHex=new InttoHex();
	}

	@Test
	public void test() {
		assertTrue(inttoHex.inttoHex(0).equals("0"));
		assertTrue(inttoHex.inttoHex(16*16).equals("100"));
		assertTrue(inttoHex.inttoHex(-16*16).equals("-100"));
		assertTrue(inttoHex.inttoHex(Integer.MAX_VALUE).equals("7FFFFFFF"));//测试最大数
		assertTrue(inttoHex.inttoHex(Integer.MIN_VALUE).equals("80000000"));//测试最小数
	}

}
