package com.kh.ex03.string;

public class StringPractice {
	// String�� �ڹٿ��� ���� ���� ���Ǵ� Type
	// ���� ���ͳݿ��� ���� ���� ���Ǵ� �ڷ����� ���ڿ�

	public static void main(String[] args) {
		String str = "abc";
		str = new String("abc");
		str = "ABC" + "DEF"; // �տ����ڰ� �ȴ�.
		str = new String("ABC" + "DEF");
		System.out.println(str);

		// 12345ABCDEF -> �ȵȴ�
		str = 123 + 45 + "ABC" + "DEF";
		System.out.println(str);

		// 12345ABCDEF
		str = 123 + (45 + "ABC") + "DEF";
		System.out.println(str);

		// ��Ģ���� �켱���� */% +-
		// -> �켱���� �ޱ򸮸� ��ȣ���!
		int value = (3 + 4) * 2; // 14
		System.out.println(value);

		// �ѱ� ����ϱ�
		str = "�ѱ۵� ��µ˴ϴ�.";
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
		System.out.println("\"�ȳ�?\"");
		
		// File path
		System.out.println("path : '\\' ");
		System.out.println("/02_Variable/src/com/kh/ex03/string/StringPractice.java");
		System.out.println("C:\\Program Files");
		
		// unicode ���!!
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println(Integer.toHexString((int)'A'));
		System.out.println("\u0041"); // 16������ ǥ���ؾ���!!
		// 16������?
		// 0x0, 0x1, 0x2, 0x3 ... 0x9, 0xA, 0xB, 0xC, 0xD, 0xE, 0xF

	}
}
