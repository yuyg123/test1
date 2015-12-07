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
		BufferedOutputStream bos = null; // �½�һ�������
		FileOutputStream fos = null; // w�ļ���װ�����
		File file = null;
		try {
			File dir = new File(filePath);
			if (!dir.exists() && dir.isDirectory()) {// �ж��ļ�Ŀ¼�Ƿ����
				dir.mkdirs();
			}
			file = new File(filePath + "\\" + fileName); // �½�һ��file��
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos); // �����byte�ļ�
			bos.write(bfile);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close(); // �ر���Դ
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close(); // �ر���Դ
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return bfile;
	}

}
