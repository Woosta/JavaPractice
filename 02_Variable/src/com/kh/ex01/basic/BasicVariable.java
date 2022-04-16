package com.kh.ex01.basic;

public class BasicVariable {
	
	public static void main(String[] args) { // 블록 시작
		// 변수 선언방법
		// 1) Type 변수명; // 선언만 하는 방법
		// 2) Type 변수명 = 리터럴(값); // 선언과 동시에 초기화 하는 문법
		
		// 방법1 ※ 주의점 : 변수를 초기화 하기전에 사용할경우 컴파일 에러가 발생!
		int myValue;
//		System.out.println(myValue); // 초기화 전에 사용함으로 에러 발생!!
		myValue = 10;
		System.out.println(myValue);
		myValue = 321;
		// 선언된 변수는 재사용이 가능하다. 범위는 자신의 Block(블록)까지
		// Block = 중괄호 {}
		System.out.println(myValue);
		
		// 방법2 : 보편적인 방법
		int value2 = 123;
		System.out.println(value2);
		
		// 변수 선언 안되는 경우 (컴파일적으로) 3가지
		// 1. 예약어를 사용하면 안된다.
		// 2. 숫자로 시작하면 안된다.
		// 3. 특수문자는 '_' '$'만 사용할수 있다.
		
//		int static = 0; // systax error 발생!! (문법 에러)
//		int 321Value = 312;
//		int @#@value = 123;
//		int _$value = 123;
		
		// 선언 요령 = 기업/프로젝트에서의 제약 
		// 1. 대소문자 구별이 명확한 카멜 표기법을 사용한다. = myValueOfAge
		// 2. 변수명을 사람들이 쉽게 인지 할 수 있도록 선언한다. 
//		      -> a,b,c x,y,z는 abc 일반적인 변수명으로 금지  -> 수학기호나 알고리즘 짤때는 인정
		//    a = 31;// 나이, b = "홍길동" .. 
		// 3. 영문으로 표기한다. 한글사용금지. 인코딩 이슈 -> 프로그램에 에러발생...
//		String 이름 = "홍길동";
//		int 나이 = 23;
//		System.out.println(이름 + " " + 나이);
		// 4. 멤버변수와 지역변수는 중복을 피한다. 단, 일시적인 코드는 가능
		// 5. 변수명 적절한 길이로 선언? myValueOfAddress = 허용 범위 마지노선
		// 전문가스럽게.
		
	} // 블록 끝!
	
}
