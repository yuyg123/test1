package testCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import test1.Bfile;

public class Bfiletest {
	private Bfile bfile;

	@Before
	public void setUp() throws Exception {
		bfile = new Bfile();
	}

	/*
	 * 测试文件内容为空
	 */
	@Test
	public void test1() throws IOException {
		String filePath = "C:/Users/John/Desktop/a.txt";
		byte[] c = null;
		try {
			c = bfile.file2Buf(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] b = {};
		assertArrayEquals(b, c);

	}
	
	/*
	 * 测试小文件
	 */
	@Test
	public void test2() throws IOException {
		String filePath = "E:/testBFile/a.txt";
		byte[] c = null;
		try {
			c = bfile.file2Buf(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] b ={ 49, 50, -76, -13, -55, -7, -75, -64 };
		assertArrayEquals(b, c);

	}
	
	/*
	 * 测试文件是否存在
	 */
	@Test
	public void test3() throws IOException {
		String filePath = "E:/testBFile/b.txt";
		byte[] c = null;
		try {
			c = bfile.file2Buf(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] b = { 49, 50, -76, -13, -55, -7, -75, -64 };
		assertArrayEquals(b, c);

	}
	
	/*
	 * 测试文件类型
	 */
	@Test
	public void test4() throws IOException {
		String filePath = "E:/testBFile/test测试文件.rtf";
		byte[] c = null;
		try {
			c = bfile.file2Buf(filePath);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] b = { 49, 50, -76, -13, -55, -7, -75, -64 };
		assertArrayEquals(b, c);

	}
	
	/*
	 * 测试文件是否丢失信息
	 */
	@Test
	public void test5() throws IOException {
		String filePath = "E:/testBFile/test测试文件.rtf";
		byte[] c = null;
		try {
			c = bfile.file2Buf(filePath);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file=new File(filePath);
		assertTrue(c.length==file.length());

	}


}
