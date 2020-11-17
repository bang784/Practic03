package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		int no1 = sc.nextInt();
		
		System.out.print("숫자: ");
		int no2 = sc.nextInt();
		
		System.out.print("숫자: ");
		int no3 = sc.nextInt();
		
		System.out.print("숫자: ");
		int no4 = sc.nextInt();
		
		System.out.print("숫자: ");
		int no5 = sc.nextInt();
		
		
		if(no1>=no2 && no1>=no3 && no1>=no4 && no1>=no5) {System.out.println("최대값은 " + no1 + "입니다.");}
		else if(no2>=no1 && no2>=no3 && no2>=no4 && no2>=no5) {System.out.println("최대값은 " + no2 + "입니다.");}
		else if(no3>=no2 && no3>=no1 && no3>=no4 && no3>=no5) {System.out.println("최대값은 " + no3 + "입니다.");}
		else if(no4>=no2 && no4>=no3 && no4>=no1 && no4>=no5) {System.out.println("최대값은 " + no4 + "입니다.");}
		else {System.out.println("최대값은 " + no5 + "입니다.");}
		
		
		sc.close();
		
		
		
	}
		
}
