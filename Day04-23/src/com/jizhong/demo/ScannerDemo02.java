package com.jizhong.demo;

import java.util.Scanner;

public class ScannerDemo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的用户名：");
		String name = sc.next();	//第一次打开控制台输入数据并返回
		System.out.println(name);
		
		
		System.out.println("请输入您的密码：");
		String password = sc.next();	//第二次打开控制台输入数据并返回
		System.out.println(password);
		
		
		
		sc.close();
	}
}
