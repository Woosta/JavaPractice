package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public static Scanner sc = new Scanner(System.in);
//	�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
//	���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
//	ex.
//	1. �Է�
//	2. ����
//	3. ��ȸ
//	4. ����
//	7. ����
//	�޴� ��ȣ�� �Է��ϼ��� : 3
//	��ȸ �޴��Դϴ�.
	public void practice1(){
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : " );
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum) {
			case 1 : System.out.println("�Է� �޴��Դϴ�"); break;	
			case 2 : System.out.println("���� �޴��Դϴ�"); break;
			case 3 : System.out.println("��ȸ �޴��Դϴ�"); break;
			case 4 : System.out.println("���� �޴��Դϴ�"); break;
			case 7 : System.out.println("���� �޴��Դϴ�"); break;
			default : System.out.println("���� �޴��Դϴ�."); break;
		}
	}
//	Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
//	¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
//	����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
//	ex.
//	���ڸ� �� �� �Է��ϼ��� : -8
//	����� �Է����ּ���
	public void practice2(){
		System.out.print("���ڸ� �� �� �Է��ϼ��� : " );
		int num = Integer.parseInt(sc.nextLine());
	
		if(num < 0) {
			System.out.println("����� �Է����ּ���.");
		} else if(num % 2 == 0) {
			System.out.println("¦����.");
		}else {
			System.out.println("Ȧ����.");
		}
	}
	
	/*
	 * ex 1. ex 2.
		�������� : 88
		�������� : 50 
		�������� : 40 
		���հ��Դϴ�. 
		
		�������� : 45
	    �������� : 50
 		�������� : 88
		���� : 50
		���� : 45
		�հ� : 183
		��� : 61.0
		�����մϴ�, �հ��Դϴ�!
	 */
	public void practice3(){
		System.out.print("�������� : ");
		int korScore = Integer.parseInt(sc.nextLine());
		
		System.out.print("�������� : ");
		int mathScore = Integer.parseInt(sc.nextLine());
		
		System.out.print("�������� : ");
		int engScore = Integer.parseInt(sc.nextLine());
		
		if(korScore < 40 || mathScore < 40 || engScore < 40) {
			System.out.println("�������� ���հ��Դϴ�.");
			return;
		}

		int totalScore = korScore + mathScore + engScore;
		double avgScore = totalScore / 3.0;
		
		if(avgScore < 60.0) {
			System.out.println("��� ���հ��Դϴ�.");
		}else {
			System.out.println("�հ� : " + totalScore);
			System.out.println("��� : " + avgScore);
			System.out.println("�հ��Դϴ�. ");
		}
		
	}
	
	public static void main(String[] args) {
		ControlPractice cp = new ControlPractice();
//		cp.practice1();
//		cp.practice2();
		cp.practice3();
	}
}
