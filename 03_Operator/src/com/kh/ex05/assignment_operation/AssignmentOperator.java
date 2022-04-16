package com.kh.ex05.assignment_operation;

public class AssignmentOperator {
	// 대입 연산자
	
	public static void main(String[] args) {
		// 가장 기초적인 대입(Assign) 방법
		int a = 10;
		int b = 10;
		
		a = a + 10;
		System.out.println(a);
		
		b += 10; // 위에 표현과 논리적으로 동치하다. = 20
		System.out.println(b);
		
//		b =+ 10; // =+ 잘못된 문법이 아니다!!
		System.out.println(b); // 10????
		
		// 오칙연산
		b =+ 10;
		b -= 10;
		b *= 10;
		b /= 10;
		b %= 10;
		
		// Selection mode -> alt + shift + a 
		
		// 잘못된 연산법!! 주의할것!
//		b =+ 10; // b = (+10);
//		System.out.println(b);
//		b =- 10; // b = (-10);
//		System.out.println(b);
//		b =* 10;
//		b =/ 10;
//		b =% 10;
		
	}
}
