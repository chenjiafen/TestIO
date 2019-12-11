package com.test.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProDemo2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 创建属性集对象
		Properties pro=new Properties();
		pro.setProperty("filename", "pro.txt");
		pro.setProperty("length", "209385038");
		pro.setProperty("location", "D:\\pro.txt");
		//创建文件,属性写入文件内
		FileWriter fw=new FileWriter("pro.txt");
		pro.store(fw, "key-value"); 
		fw.close();
		// 加载文本中信息到属性集
		pro.load(new FileInputStream("pro.txt"));
		// 遍历集合并打印
		Set<String> strings = pro.stringPropertyNames();
		for(String key:strings){
			System.out.println(key+" ‐‐ "+pro.getProperty(key)); 
		}
	}
}
