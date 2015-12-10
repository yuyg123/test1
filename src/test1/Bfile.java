package test1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Bfile {

	public static void main(String[] args) {
		String filePath = "D:/succezIDE/jdk/jdk1.8.0_45/jre/THIRDPARTYLICENSEREADME.txt";
		byte[] bfile = null;
		try {
			bfile = file2Buf(filePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < bfile.length; i++) {
			System.out.print(bfile[i] + ",");
		}

	}

	/*
	 * 文件转换为byte[]数组
	 */
	public static byte[] file2Buf(String filePath) throws Exception {
		File file = new File(filePath);
		byte[] bfile = null;
		if (!file.exists() || file.isDirectory()) {
			throw new Exception("文件不存在或输入文件路径错误");
		}
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream bos = new ByteArrayOutputStream(4096);
		byte[] b = new byte[4096];
		int i;
		try {
			while ((i = fis.read(b)) != -1) {
				bos.write(b, 0, i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception E) {

				}

			}
			if (bos != null) {
				try {
					bos.close();
				} catch (Exception E) {

				}
			}
		}
		bfile = bos.toByteArray();
		return bfile;
	}

}
