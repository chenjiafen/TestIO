package com.test.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSWrite03 {

	public static void main(String[] args) throws IOException {
		 // ʹ���ļ����ƴ���������
        FileOutputStream fos = new FileOutputStream("fos.txt");    
       // �ַ���ת��Ϊ�ֽ�����  
       byte[] b = "abcde".getBytes();  
       // д��������2��ʼ��2���ֽڡ�����2��c�������ֽڣ�Ҳ����cd��        
        fos.write(b,2,2);
       // �ر���Դ  
        fos.close();

	}

}
