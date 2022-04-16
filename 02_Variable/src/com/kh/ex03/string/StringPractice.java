package com.kh.ex03.string;

public class StringPractice {
	// String은 자바에서 가장 많이 사용되는 Type
	// 현재 인터넷에서 가장 많이 사용되는 자료형은 문자열

	public static void main(String[] args) {
		String str = "abc";
		str = new String("abc");
		str = "ABC" + "DEF"; // 합연산자가 된다.
		str = new String("ABC" + "DEF");
		System.out.println(str);

		// 12345ABCDEF -> 안된다
		str = 123 + 45 + "ABC" + "DEF";
		System.out.println(str);

		// 12345ABCDEF
		str = 123 + (45 + "ABC") + "DEF";
		System.out.println(str);

		// 사칙연산 우선순위 */% +-
		// -> 우선순위 햇깔리면 괄호사용!
		int value = (3 + 4) * 2; // 14
		System.out.println(value);

		// 한글 출력하기
		str = "한글도 출력됩니다.";
		System.out.println(str);

		// \t tab
		System.out.println("ABCVDS\tDDD\tDDD");
		System.out.println("ABC\tDDDE\tFFFF");
		System.out.println("ABC\tDDD\tFFED");

		// \n new line
		System.out.print("ABC\n");
		System.out.print("DEF\n");
		System.out.print("ABC" + "\n");
		System.out.print("DEF\n");

		// \"
		System.out.println("\"안녕?\"");
		
		// File path
		System.out.println("path : '\\' ");
		System.out.println("/02_Variable/src/com/kh/ex03/string/StringPractice.java");
		System.out.println("C:\\Program Files");
		
		// unicode 출력!!
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println(Integer.toHexString((int)'A'));
		System.out.println("\u0041"); // 16진수로 표현해야함!!
		// 16진수란?
		// 0x0, 0x1, 0x2, 0x3 ... 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF

	}
}
