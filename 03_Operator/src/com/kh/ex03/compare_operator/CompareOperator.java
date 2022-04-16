package com.kh.ex03.compare_operator;

public class CompareOperator {
	// 비교 연산자
	
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.println(a == b); // a가 b와 같은지?
		System.out.println(a != b); // a가 b가 같지 않은지?
		System.out.println("---------------------------");
		
		// 문자열 비교.... ※주의 : 이해하기 매우 어려움!!
		System.out.println("문자열 비교");
		String str1 = "안녕하세요?";
		String str2 = "안녕하세요?";
		String str3 = new String("안녕하세요?");
		
		System.out.println(str1 == str2); // 예측 : true
		System.out.println(str1 == str3); // 예측 : true -> 틀림!! false임.
		
		// String 비교시에는 항상 주의해야하는데, '==' 쓰면 틀린 결과가 나올수 있다!!
		// 문자열비교는 'equals' 메소드를 사용할것!
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		
		// 문자열 포함하는지 확인하는 함수 = contains
		str3 = new String("안녕");
		System.out.println(str1.contains(str2)); // 가나다 - 가나다
		System.out.println(str1.contains(str3)); // 가나다 - 가다
	}
}
