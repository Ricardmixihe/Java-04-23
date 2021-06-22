package com.jizhong.demo;

import java.util.Scanner;

public class Test {
	public static void main (String[] args) {	
		//1. 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		//2. 提示用户输入用户名
		System.out.println("请输入您的用户名：");
		//3. 打开控制台，输入用户名，并且返回用户名
		String name = sc.next();
		//4. 提示用户输入用户名
		System.out.println("请输入您的年龄：");
		//5. 打开控制台，输入年龄，并返回年龄
		String age = sc.next();
		//6. 打印用户名和年龄
		System.out.println("姓名：" + name + "\n" + "年龄：" + age);
		//7. 关闭资源
		sc.close();
	}
}
