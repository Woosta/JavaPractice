package com.kh.ex05.assignment_operation;

public class AssignmentOperator {
	// ���� ������
	
	public static void main(String[] args) {
		// ���� �������� ����(Assign) ���
		int a = 10;
		int b = 10;
		
		a = a + 10;
		System.out.println(a);
		
		b += 10; // ���� ǥ���� �������� ��ġ�ϴ�. = 20
		System.out.println(b);
		
//		b =+ 10; // =+ �߸��� ������ �ƴϴ�!!
		System.out.println(b); // 10????
		
		// ��Ģ����
		b =+ 10;
		b -= 10;
		b *= 10;
		b /= 10;
		b %= 10;
		
		// Selection mode -> alt + shift + a 
		
		// �߸��� �����!! �����Ұ�!
//		b =+ 10; // b = (+10);
//		System.out.println(b);
//		b =- 10; // b = (-10);
//		System.out.println(b);
//		b =* 10;
//		b =/ 10;
//		b =% 10;
		
	}
}
