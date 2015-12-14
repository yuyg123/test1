package testCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import test1.IntToHex;

public class InttoHexTest {
	@Before
	public void setUp() throws Exception {
		new IntToHex();
	}

	/**
	 * 测试10进制转16进制的方法是否正确
	 */
	@Test
	public void test() {
		assertEquals("0", IntToHex.intToHex(0)); // 测试0
		assertEquals("9", IntToHex.intToHex(9));
		assertEquals("-9", IntToHex.intToHex(-9));
		assertEquals("A", IntToHex.intToHex(10));
		assertEquals("-A", IntToHex.intToHex(-10));
		assertEquals("F", IntToHex.intToHex(15));
		assertEquals("-F", IntToHex.intToHex(-15));
		assertEquals("10", IntToHex.intToHex(16));
		assertEquals("-10", IntToHex.intToHex(-16));
		assertEquals("FF", IntToHex.intToHex(255));
		assertEquals("-FF", IntToHex.intToHex(-255));
		assertEquals("7FFFFFFF", IntToHex.intToHex(Integer.MAX_VALUE)); // 测试int类型的最大值
		assertEquals("-80000000", IntToHex.intToHex(Integer.MIN_VALUE)); // 测试int类型最小值
	}

}
