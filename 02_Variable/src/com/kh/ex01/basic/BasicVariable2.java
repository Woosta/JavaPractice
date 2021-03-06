package com.kh.ex01.basic;

import java.math.BigDecimal;

public class BasicVariable2 {
	// 기본형 Type  = 8개.
	// 1. 정수형 : byte(1), short(2), int(4), long(8)
	// 2. 실수 : float(4), double(8)
	// 3. 문자 : char(2)
	// 4. 논리형 : boolean(1)
	// 기본형의 특징 : 메모리에 직접 값이 저장되는 변수
	// 참고 : 참조형의 경우 메모리에 저장되는 값은 실제 값이 있는 메모리(heap) 주소지가 저장됨 
	
	public static void main(String[] args) {
		// 1. 정수형 : byte(1), short(2), int(4), long(8)
		byte byteValue = 100;
		short shortValue = 200;
		int intValue = 40000;
		long longValue = 1414141093104021443L; // long 리터럴 사용시 반드시 'l' 또는 'L'이 있어야함

		// 2. 실수 : float(4), double(8)
		float floatValue = 3.141592653589793238f; // float 사용시 반드시 'f' 또는 'F'가 있어야함
		double doubleValue = 3.141592653589793238;
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
		// 부동소수점의 표현은 오류를 내포한다는 것을 인지하고 사용
		// 컴퓨터에서 부동소수점 연산은 항상 오차를 발생하나 double로 사용할 경우 오차가 극히 적음. 
		// 부동소수점 표현 방법 지수부(10^-1), 가수부(314159265...)로 구성되어 있음
		// 실제 변수 크기에 따라 표현이 제한적이다!
		
		// BigDecimal  -> 가능한 쓰지 말것.
		// 이유 : 부동소수점 연산 자체가 느린데, 부동소수점 연산보다 10배 더 느림... 
		BigDecimal bigValue = new BigDecimal("3.14159265358964354968504968793238"); // 바로 계산 불가능
		System.out.println(bigValue);
		
		float testFloat = 0.1f + 0.2f;
		double testDouble = 0.1 + 0.2;
		System.out.println(testFloat); // 0.3
		System.out.println(testDouble); // 0.3
		// 결론 : 부동소수점은 항상 오차 발생함으로 자리수 제한을 항상 염두필요!!
		
		String str = String.format("%.2f", testDouble);
		System.out.println(str);
		
		// 3. 문자 : char(2)
		char charValue1 = 65; // A
		char charValue2 = 'A'; 
		char charValue3 = '가'; 
		String strValue = "안녕하세요?";
		
		System.out.println(charValue1);
		System.out.println(charValue2);
		System.out.println(charValue3);
		System.out.println(strValue);
		System.out.println(strValue + charValue1 + charValue2 + charValue3);
		System.out.println(charValue1 + charValue2 + charValue3 + strValue);
		// 합연산이 가능!
		
		for(int i =0; i<26; i++) {
			System.out.print((char)(i + 'A'));
		}
		for(int i =0; i<12; i++) {
			System.out.print((char)(i + '가'));
		}
		System.out.println();
		System.out.println((int)'가');
		
		// 4. 논리형 : boolean(1)
		boolean isTrue = true;
		System.out.println(isTrue);
		isTrue = false;
		System.out.println(isTrue);
		
		
		// 상수란? 프로그래밍에서 절대 변하지 않는 수!
		// 상수 표기법 : 모두 대문자 사용하고 띄어쓰기는 '_' 사용할것!
		final int LECTURE_MAX_SIZE = 30; // 수강생 최대인원
//		LECTURE_MAX_SIZE = 60;
		System.out.println(LECTURE_MAX_SIZE);
		System.out.println(LECTURE_MAX_SIZE2);
		
	}
	// 상수는 public final static로 표현하는 것이 정석
	public final static int LECTURE_MAX_SIZE2 = 60; // 수강생 최대인원
}





