package com.kh.ex04.overflow;

public class OverflowTest { // Overflow = ��ħ,ȫ��
	public static void main(String[] args) {
		byte temp = 125;
		System.out.println(++temp);
		System.out.println(++temp);
		System.out.println(++temp);
		System.out.println(++temp);
		// �ǵ����� ���� overflow...
		
		// 300�� ���޵��� �ʾ� ���� �ݺ���
		for(byte i = 0; i < 300; i++) {
			System.out.println(++temp);
		}
		
	}
}