package test1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Bfile {

	public static void main(String[] args) {
		String path = "C:/Users/John/Desktop/a.txt";
		File file = new File(path);
		byte[] bfile = null;
		try {
			bfile = file2buf(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		for(int i=0;i<bfile.length;i++){
			System.out.print(bfile[i]);
		}
	
	}

	/*
	 * 根据文件生成byte数组
	 */
	public static byte[] file2buf(File file) throws IOException {
		byte[] bfile = null;
		if (!file.exists()) {
			return null;
		}
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
		byte[] b = new byte[1000];
		int i;
		while ((i = fis.read(b)) != -1) {
			bos.write(b, 0, i);
		}
		fis.close();
		bos.close();
		bfile = bos.toByteArray();
		return bfile;
	}
	

}
