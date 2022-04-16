package com.kh.ex04.logical_operator;

public class LogicalOperator {
	// �� ������
	
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		boolean z = true;
		
		System.out.println(x && y); // AND ���� - �Ѵ� ���϶��� ��
		System.out.println(x || y); // OR ���� - ���߿� �ϳ��� ���̸� ��
		System.out.println(x && y && z); // 3�� AND ������ ����!
		System.out.println(x || y || z); // 3�� OR ������ ����!
		System.out.println(x || y && z); // && > ||, y && z -> x || (���) 
		System.out.println((x || y) && z); // or �� and ������ ȥ���Ҷ��� �ǵ������� ��ȣ�� ����Ұ�! 
		System.out.println(x || (y && z)); // or �� and ������ ȥ���Ҷ��� �ǵ������� ��ȣ�� ����Ұ�! 
		System.out.println("-----------------------------------------");
		// ��ȣ�� ���������� �ĵ� ���� ����!!
		
		// �� ������
		int a = 100;
		int b = 50;
		System.out.println(a > b); // a�� b���� ū��?
		System.out.println(a < b); // a�� b���� ������?
		System.out.println(a >= 100); // a�� 100���� ũ�ų� ������?
		System.out.println(a <= 100); // a�� 100���� �۰ų� ������?
		System.out.println("-------------------------------------");
		
		// �� ������ ����
		int c = 70;
		// c�� a���� �۰�, b���� ū��?
//						   true > 50
//		System.out.println(a > c > b); // �ȵȴ�!
//		System.out.println((a > c) > b); // �ȵȴ�!
		System.out.println(c < a && c > b); // ���������� �ܿ����Ѵ�!!
		
		// a�� 50���� ũ��, 150���� ������?
		System.out.println(a > 50 && a < 150);
		
		// b�� 20�̻�, 100�̸��ΰ�?
		System.out.println(b >= 20 && b < 100);
	}
}





