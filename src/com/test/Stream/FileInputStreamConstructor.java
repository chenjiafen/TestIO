package com.test.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStream 类是文件输入流，从文件中读取字节 FileInputStream(File file) ：
 * 通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
 * FileInputStream(String name) ： 通过打开与实际文件的连接来创建一个 FileInputStream
 * ，该文件由文件系统中的路径名 name命名。
 * 
 * @author tyler.chen
 *
 */
public class FileInputStreamConstructor {

	public static void main(String[] args) throws IOException {
		//  使用File对象创建流对象    
		File file = new File("a.txt");
		FileInputStream fos = new FileInputStream(file);
		int b;
		while ((b = fos.read()) != -1) {
			System.out.println((char) b);
		}

		//  使用文件名称创建流对象
		FileInputStream fos01 = new FileInputStream("b.txt");
		int c;
		while ((c = fos01.read()) != -1) {
			System.out.println((char)c);

		}
		fos.close();
		fos01.close();
	}

}
