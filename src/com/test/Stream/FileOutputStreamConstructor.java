package com.test.Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamConstructor {
	/**
	 * public FileOutputStream(File file) �������ļ��������д����ָ���� File�����ʾ���ļ���
	 *  public FileOutputStream(String name) �� �����ļ��������ָ��������д���ļ���
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// ʹ��File���󴴽�������    
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
     
        // ʹ���ļ����ƴ���������
        FileOutputStream fos01 = new FileOutputStream("b.txt");

	}

}
