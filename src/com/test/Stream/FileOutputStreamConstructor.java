package com.test.Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamConstructor {
	/**
	 * public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
	 *  public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/**
		 * 当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。如果有这个文
		 *件，会清空这个文件的数据。
		 */
		// 使用File对象创建流对象    
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        // 使用文件名称创建流对象
        FileOutputStream fos01 = new FileOutputStream("b.txt");

	}

}
