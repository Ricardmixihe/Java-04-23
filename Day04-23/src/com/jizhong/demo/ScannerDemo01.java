package com.jizhong.demo;

import java.util.Scanner;

public class ScannerDemo01 {

	public static void main(String[] args){
		//1. 打开控制台
		Scanner sc = new Scanner(System.in);	//打开控制台输入
		System.out.println("请输入你的名字：");
		//2. 获取控制台输入数据
		String name = sc.next();
		//3. 打印数据
		System.out.println("欢迎光临：" + name);
		//4. 关闭控制台
		sc.close();
		
	}
}
