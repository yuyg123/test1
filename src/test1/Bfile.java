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
	 * @param filePath 文件路径
	 * @return Byte数组
	 * @throws IOException
	 */
	public static byte[] file2Buf(String filePath) throws IOException {
		File file = new File(filePath);// 创建文件
		long fileLength = file.length();
		byte[] bfile = null;
		if (!file.exists() || file.isDirectory()) {
			throw new IOException("文件不存在或输入文件路径错误");
		}
		FileInputStream fis = new FileInputStream(file);// 建立一个文件输入流
		ByteArrayOutputStream bos = new ByteArrayOutputStream(8192);// 建立一个容量为8kb的缓冲区，
		byte[] b = new byte[(int) fileLength];
		int i;
		try {
			while ((i = fis.read(b)) != -1) {
				bos.write(b, 0, i);// 将缓冲区的字节写入到b数组中
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (bos != null) {
				bos.close();
			}
		}
		bfile = bos.toByteArray();
		return bfile;
	}

}
