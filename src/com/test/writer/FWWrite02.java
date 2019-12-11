package com.test.writer;
/**
 * 写出字符数组
 * @author tyler.chen
 *
 */

import java.io.FileWriter;
import java.io.IOException;

public class FWWrite02 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("fw02.txt");
		char[] chars="个人金融中心".toCharArray();
		fw.write(chars);
		// 写出从索引2开始，2个字节。索引2是'技'，两个字节，也就是'金融'。 
		fw.write(chars,2,2); //金融
		fw.close();
	}
}
