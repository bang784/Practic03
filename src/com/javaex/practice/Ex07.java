package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
	
		
		int num = sc.nextInt();
	
		sc.close();
		
		for(int x=1; x<=num; x++) {
			for(int y=1; y<=x; y++) {
			
			System.out.print(x); //y로 놓으면 1, 12, 123, 1234, 12345 이런식으로 됨
			}
			System.out.println();
		}
		
		
		
		

	}

}
