package com.test.file;

import java.io.File;

public class FileIs {
	/**
	 * 判断功能的方法
	 * public boolean exists() ：此File表示的文件或目录是否实际存在。
	 * public boolean isDirectory() ：此File表示的是否为目录。
	 * public boolean isFile() ：此File表示的是否为文件。
	 * @param args
	 */
	public static void main(String[] args) {
		 File f = new File("d:\\aaa\\bbb.java");
		 File f2 = new File("d:\\aaa");
		// 判断是否存在  
		System.out.println("d:\\aaa\\bbb.java 是否存在:"+f.exists());
		System.out.println("d:\\aaa 是否存在:"+f2.exists());
		// 判断是文件还是目录  
		System.out.println("d:\\aaa 文件?:"+f2.isFile());
		System.out.println("d:\\aaa 目录?:"+f2.isDirectory());

	}

}
