package com.kh.ex02.arithmetic_operator;

public class ArithmeticOperator {
	// ��� ������ +-/* %
	
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 0;
		
		System.out.println("��Ģ����");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / 3); // int�� 3
		System.out.println(a / 3.0); // �Ҽ��� ǥ���ϴ� ��� 1
		System.out.println(a / (double)3); // �Ҽ��� ǥ���ϴ� ��� 2
		System.out.println((double)(a / 3)); // �ȵǴ� ǥ��... ��������
		
		// / by zero 
//		System.out.println(a / 0); // java.lang.ArithmeticException 
		
		System.out.println("% ��ⷯ ����");
		c = 10 % 3; // ������ ���� = 1
		System.out.println(c);
		c = 10 % 2; // ¦�� ���� �Ǻ��Ҷ�
		System.out.println(c);
		c = 9 % 3; // ������� Ȯ���Ҷ�
		System.out.println(c);
		
		// if������ ¦�� ���͸� �ϴ� ���
		c = 5;
		if(c % 2 == 0) {
			System.out.println(c + "�� ¦�� �Դϴ�!"); // ���϶� ����
		} else {
			System.out.println(c + "�� Ȧ�� �Դϴ�!"); // �����϶� ����
		}
		
		// ���� + �Ǽ� ����Ҷ� ������
		// : ��Ģ����� type�� ũ�Ⱑ ū������ �ڵ�����ȯ �ȴ�!
		// double > float >  long >  int >  short >  byte
		float pi = 3.14f; // long���� ũ��!
		double x = 1.2345678912;
		int i = 10;
 		
		System.out.println(pi + i);  // float 
		System.out.println(pi + x);  // double
		System.out.println(pi + (float)x); // float
		
	}
}
