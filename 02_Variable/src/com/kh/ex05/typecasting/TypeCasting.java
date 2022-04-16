package com.kh.ex05.typecasting;

public class TypeCasting {
	// ���� 2����
	// 1) �ڵ� ����ȯ : �������� ū���� ����, �ƹ� ������ ����, Cast�� �������� �ʾƵ� �ȴ�. // ������ ����ȯ 
	// 2) ���� ����ȯ : ū������ �������� ����, ������ �ս� �߻��Ҽ� �ִ�. -> ���� �߻�!!!
	//              �ݵ�� Cast�� �����ؾ� �Ѵ�. -> ���ϸ� �����߻�!! // ������ ����ȯ 
	//              cast ���� : (type)������;

	public static void main(String[] args) {
		byte val = 100;
		val = (byte)123; // ������ ����ȯ�� �Ǵ� ��Ȳ���� ���������� cast�� �ۼ��� �ڵ� -> ��������
//		val = 4000; // Type mismatch �߻�!!
		val = (byte)4000; // overflow �߻�!
		System.out.println(val);
		
		// �ǵ��� ��������ȯ ���� 1. �Ҽ��� ������!
		int value1 = 0;
		double value2 = 3.14; // �Ҽ��� ������ �ʿ��Ҷ� ���� ����ȯ�� ��Ű�� ��������.
		value1 = (int)value2;
		System.out.println(value1);
		
		// �ǵ��� ��������ȯ ���� 2. ���ڿ� ����ȯ
		char ch = 'A';
		int alpha = ch;
		System.out.println(alpha);
		System.out.println((char)alpha); // ��������ȯ
		System.out.println((char)++alpha); // ��������ȯ
		System.out.println((char)++alpha); // ��������ȯ
		System.out.println((char)++alpha); // ��������ȯ
		System.out.println((char)(alpha-'A'+'a'));
	
	}
}