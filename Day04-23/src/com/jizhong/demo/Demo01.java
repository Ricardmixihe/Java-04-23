package com.jizhong.demo;

/**
 * 
 * @author BaiHongyu
 * 
 * 基本数据类型：
 * 		整数类型：byte short int long
 * 		浮点数类型：float double
 * 		布尔类型：boolean
 * 		字符类型：char
 * 引用数据类型：
 * 		字符串类型：String
 *
 */
public class Demo01 {
	public static void main(String[] args){
		/*
		 * 变量定义
		 * 	数据类型 变量名 = 值;
		 */
		int num1 = 100;	//整数类型
		double num2 = 100.00;	//浮点数
		boolean b = true;	//布尔：true false
		char c = '字';	//字符
		
		byte numb = 100;
		short nums = 200;
		long numl = 3000l;	//一般long类型定义整数，需要在数字后加上小写‘l’
		
		float numf = 30.23f;	//float类型定义小数，必须在数字后加上小写'f'
		
		//字符串类型
		String str;	//声明变量
		str = "Hello Wolrd";	//为变量赋值
		
		
		System.out.println("int类型" + num1);
		System.out.println("double类型" + num2);
		System.out.println("boolean类型" + b);
		System.out.println("char类型" + c);
		System.out.println("byte类型" + numb);
		System.out.println("short类型" + nums);
		System.out.println("long类型" + numl);
		System.out.println("float类型" + numf);
		System.out.println("String类型" + str);
	}
}
