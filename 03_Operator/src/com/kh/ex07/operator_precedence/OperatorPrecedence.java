package com.kh.ex07.operator_precedence;

public class OperatorPrecedence {
	// 연산자 우선순위
	
	public static void main(String[] args) {
		// 1. 사칙연산 우선순위
		System.out.println(1 + 2 * 3); // 곱셈이 우선순위 높음
		
		// 2. 단항연산자 우선순위
		int a = 10;
		System.out.println(++a * 10); // 단항연산자가 우선순위 높음
		
		// 3. 산술 논리 복합될때
		System.out.println(3 + 4 > 5); // 산술 높음! 7 > 5 = true
		System.out.println(3 + 4 == 5); // 산술 높음!
		System.out.println((3 + 4) == 5); // 괄호를 통해 우선순위 명시적으로 사용할것!
		
		// 결론 : 복잡하거 햇깔리면 괄호()써라!!
	}
}
