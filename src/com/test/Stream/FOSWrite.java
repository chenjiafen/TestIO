package com.test.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite {
	/**
	 * �� write(int b) ������ÿ�ο���д��һ���ֽ���
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
	       // ʹ���ļ����ƴ���������
        FileOutputStream fos = new FileOutputStream("fos.txt");    
       // д������  
       fos.write(97); // д����1���ֽ�  
       fos.write(98); // д����2���ֽ�  
       fos.write(99); // д����3���ֽ�  
       // �ر���Դ  
        fos.close();


	}

}
