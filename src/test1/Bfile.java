package test1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: 将文件内容转换成byte数组返回
 * @author yuyg yuyg@succez.com
 * @date 2015年12月11日 上午11:17:20
 *
 */
public class Bfile {

	/**
	 * 将文件内容装化为Byte数组返回
	 * @param filePath
	 * @return Byte数组
	 * @throws Exception
	 */
	public static byte[] file2Buf(String filePath) throws Exception {
		File file = new File(filePath);// 创建文件
		if (!file.exists() || file.isDirectory()) {
			throw new IOException("文件不存在或输入文件路径错误");
		}
		long fileLength = file.length();
		if (fileLength > Integer.MAX_VALUE) {
			throw new OutOfMemoryError("文件过大");
		}
		FileInputStream fis = new FileInputStream(file);// 建立一个文件输入流
		byte[] result = new byte[(int) fileLength];
		int i;
		int count = 0;
		try {
			while ((i = fis.read(result, count, 4096)) != -1) {
				count += i;// 将缓冲区的字节写入到b数组中
			}
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
		return result;
	}

}