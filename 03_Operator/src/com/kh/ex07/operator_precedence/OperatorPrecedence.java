package com.kh.ex07.operator_precedence;

public class OperatorPrecedence {
	// ������ �켱����
	
	public static void main(String[] args) {
		// 1. ��Ģ���� �켱����
		System.out.println(1 + 2 * 3); // ������ �켱���� ����
		
		// 2. ���׿����� �켱����
		int a = 10;
		System.out.println(++a * 10); // ���׿����ڰ� �켱���� ����
		
		// 3. ��� �� ���յɶ�
		System.out.println(3 + 4 > 5); // ��� ����! 7 > 5 = true
		System.out.println(3 + 4 == 5); // ��� ����!
		System.out.println((3 + 4) == 5); // ��ȣ�� ���� �켱���� ��������� ����Ұ�!
		
		// ��� : �����ϰ� �ޱ򸮸� ��ȣ()���!!
	}
}
