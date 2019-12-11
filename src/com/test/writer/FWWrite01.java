package com.test.writer;

import java.io.FileWriter;
import java.io.IOException;
/**
 * 关闭和刷新
 * @author tyler.chen
 *
 */
public class FWWrite01 {

	public static void main(String[] args) throws IOException {
		//使用文件名创建对象
		FileWriter fw=new FileWriter("fw01.txt");
		// 写出数据，通过flush
		fw.write("刷");// 写出第1个字符
		fw.flush();
		fw.write("新");// 写出第2个字符
		fw.flush();
		
		//写出数据，通过close
			fw.write("关");// 写出第1个字符
			fw.close();
			fw.write("闭");// 继续写出第2个字符,【报错】java.io.IOException: Stream closed
			fw.close();
	}

}
