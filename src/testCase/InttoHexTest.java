package testCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import test1.InttoHex;

public class InttoHexTest {
	private InttoHex inttoHex;

	@Before
	public void setUp() throws Exception {
		inttoHex = new InttoHex();
	}

	/**
	 * 
	 * @Title: test
	 * @Description: 测试10进制转16进制的方法是否正确
	 * @param:
	 * @return void
	 * @throws
	 * @author: yuyg yuyg@succez.com
	 */
	@Test
	public void test() {
		assertEquals("0", inttoHex.inttoHex(0)); // 测试0
		assertEquals("9", inttoHex.inttoHex(9)); // 测试最大个位数的情况
		assertEquals("-9", inttoHex.inttoHex(-9)); // 在负数下测试最大个位数的情况
		assertEquals("A", inttoHex.inttoHex(10)); // 测试10进制的最小2位数
		assertEquals("-A", inttoHex.inttoHex(-10)); // 在负数下测试10进制的最小2位数
		assertEquals("F", inttoHex.inttoHex(15)); // 测试16进制的最大个位数的情况
		assertEquals("-F", inttoHex.inttoHex(-15)); // 在负数下测试16进制的最大个位数的情况
		assertEquals("10", inttoHex.inttoHex(16)); // 测试16进制的最小2位数
		assertEquals("-10", inttoHex.inttoHex(-16)); // 在负数下测试16进制的最小2位数
		assertEquals("FF", inttoHex.inttoHex(255)); // 测试16进制的2位数
		assertEquals("-FF", inttoHex.inttoHex(-255)); // 在负数下测试16进制的2位数
		assertEquals("7FFFFFFF", inttoHex.inttoHex(Integer.MAX_VALUE)); // 测试int类型的最大值
		assertEquals("80000000", inttoHex.inttoHex(Integer.MIN_VALUE)); // 测试int类型最小值
	}

}
