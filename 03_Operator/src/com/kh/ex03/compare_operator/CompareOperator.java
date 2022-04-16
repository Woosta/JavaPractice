package com.kh.ex03.compare_operator;

public class CompareOperator {
	// �� ������
	
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		System.out.println(a == b); // a�� b�� ������?
		System.out.println(a != b); // a�� b�� ���� ������?
		System.out.println("---------------------------");
		
		// ���ڿ� ��.... ������ : �����ϱ� �ſ� �����!!
		System.out.println("���ڿ� ��");
		String str1 = "�ȳ��ϼ���?";
		String str2 = "�ȳ��ϼ���?";
		String str3 = new String("�ȳ��ϼ���?");
		
		System.out.println(str1 == str2); // ���� : true
		System.out.println(str1 == str3); // ���� : true -> Ʋ��!! false��.
		
		// String �񱳽ÿ��� �׻� �����ؾ��ϴµ�, '==' ���� Ʋ�� ����� ���ü� �ִ�!!
		// ���ڿ��񱳴� 'equals' �޼ҵ带 ����Ұ�!
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		
		// ���ڿ� �����ϴ��� Ȯ���ϴ� �Լ� = contains
		str3 = new String("�ȳ�");
		System.out.println(str1.contains(str2)); // ������ - ������
		System.out.println(str1.contains(str3)); // ������ - ����
	}
}
