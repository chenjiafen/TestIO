package com.test.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite02 {
	/**
	 * д���ֽ����飺 write(byte[] b) ��ÿ�ο���д�������е�����
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// ʹ���ļ����ƴ���������
        FileOutputStream fos = new FileOutputStream("fos.txt");    
       // �ַ���ת��Ϊ�ֽ�����  
       byte[] b = "���������ȴ�".getBytes();  
       // д���ֽ���������  
       fos.write(b);  
       // �ر���Դ  
        fos.close();

	}

}
