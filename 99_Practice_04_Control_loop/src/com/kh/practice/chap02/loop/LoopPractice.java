package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public static Scanner sc = new Scanner(System.in);
	
	
//	1�̻��� ���ڸ� �Է��ϼ��� : 4  1�̻��� ���ڸ� �Է��ϼ��� : 0
//	1 2 3 4                  1 �̻��� ���ڸ� �Է����ּ���.
	
	public void practice1() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num <= 0) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			return;
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num <= 0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				continue;
			}
			
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}
			break;
		}
	}
	
	
	public void practice3() {
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num <= 0) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
				continue;
			}
			
			// ù��° ������
			for(int i = 1; i <= num; i++) {
				System.out.print((num - i + 1) +" ");
			}
			
			System.out.println();

			// �ι�° ������ - i�� ���ҽ�Ű�� ����
			for(int i = num; i > 0 ; i--) {
				System.out.print(i+" ");
			}
			break;
		}
	}
	
	
	public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
//		lp.practice1();
//		lp.practice2();
		lp.practice3();
	}
}
