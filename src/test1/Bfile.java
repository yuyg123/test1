package test1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static byte[] file2buf(byte[] bfile, String filePath, String fileName) {
		BufferedOutputStream bos = null; // 新建一个输出流
		FileOutputStream fos = null; // w文件包装输出流
		File file = null;
		try {
			File dir = new File(filePath);
			if (!dir.exists() && dir.isDirectory()) {// 判断文件目录是否存在
				dir.mkdirs();
			}
			file = new File(filePath + "\\" + fileName); // 新建一个file类
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos); // 输出的byte文件
			bos.write(bfile);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close(); // 关闭资源
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close(); // 关闭资源
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return bfile;
	}

}
