package com.test.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 * ##### 构造方法
 *  FileWriter(File file) ： 创建一个新的 FileWriter，给定要读取的File对象。
 *  FileWriter(String fileName) ： 创建一个新的 FileWriter，给定要读取的文件的名称。 
 * @author tyler.chen
 *
 */
public class FileWriterConstructor {
	public static void main(String[] args) throws IOException {
		// 使用File对象创建流对象 
		File file=new File("a.txt");
		FileWriter fw=new FileWriter(file);
		
		// 使用文件名称创建流对象
		FileWriter fw01 =new FileWriter("b.txt");	
	}

}
