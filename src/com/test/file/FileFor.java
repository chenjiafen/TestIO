package com.test.file;

import java.io.File;

public class FileFor {
	/**
	 * 目录的遍历 public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
	 * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = new File("d:\\java_code");
		// 获取当前目录下的文件以及文件夹的名称。  
		String[] names = dir.list();
		for (String name : names) {
			System.out.println(name);

		}

		File[] files = dir.listFiles();
		for (File file : files) {

			System.out.println(file);
		}
	}
}
