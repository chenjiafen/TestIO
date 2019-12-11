package com.test.Properties;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * #### 基本的存储方法
 * public Object setProperty(String key, String value) ： 保存一对属性。
 * public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
 *  public Set<String> stringPropertyNames() ：所有键的名称的集合。
 * @author tyler.chen
 *
 */
public class ProDemo {

	public static void main(String[] args) {
		// 创建属性集对象
		Properties pro=new Properties();
		// 添加键值对元素
		pro.setProperty("filename", "a.txt");
		pro.setProperty("length", "209385038");
		pro.setProperty("location", "D:\\a.txt");
		
		// 打印属性集对象
		System.out.println(pro);
		// 通过键,获取属性值
		System.out.println(pro.getProperty("filename"));
		System.out.println(pro.getProperty("length"));
		System.out.println(pro.getProperty("location"));
		
		// 遍历属性集,获取所有键的集合
		Set<String>	strings=pro.stringPropertyNames();
		// 打印键值对
		for(String key : strings){
			System.out.println(key+" ‐‐ "+pro.getProperty(key));	
		}
	}
}
