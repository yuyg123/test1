package test1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Bfile {

	public static void main(String[] args) {
		String filePath = "C:/Users/John/Desktop/a.txt";		
		byte[] bfile = null;
		try {
			bfile = file2buf(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < bfile.length; i++) {
			System.out.print(bfile[i]);
		}

	}

	/*
	 * 文件转换为byte[]数组
	 */
	public static byte[] file2buf(String filePath) throws IOException {
		File file = new File(filePath);
		byte[] bfile = null;
		if (!file.exists() && file.isDirectory()) {
			return null;
		}
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream bos = new ByteArrayOutputStream(4000);
		byte[] b = new byte[4000];
		int i;
		try {
			while ((i = fis.read(b)) != -1) {
				bos.write(b, 0, i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		bfile = bos.toByteArray();
		return bfile;
	}

}
