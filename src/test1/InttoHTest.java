package test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InttoHTest {
	private InttoH ih;
	private Bfile bFile;

	@Before
	public void setUp() throws Exception {
		ih=new InttoH();
		bFile=new Bfile();
	}

	@Test
	public void test() {
		assertTrue(InttoH.inttoHex(45).equals("0x2D"));
		assertTrue(InttoH.inttoHex(-45).equals("-0x2D"));
	}
}
