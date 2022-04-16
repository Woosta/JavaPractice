package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	// �۷ι��� Scanner ����ϱ�
	public static Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���
		System.out.println("���� : ");
		System.out.println(Integer.parseInt(sc.nextLine()) > 0 ? "�����" : "����� �ƴϴ�" );
	}
	
	public void practice2(){
		// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
		System.out.println("���� : ");
		int val = 0;
		System.out.println((val = Integer.parseInt(sc.nextLine())) > 0 ? "�����" : (val == 0 ? "0�̴�" : "������"));
	}

	public void practice3(){
		System.out.println("���� �Է� : ");
		int value = Integer.parseInt(sc.nextLine());

		if(value % 2 == 0) {
			System.out.println("¦���̴�.");
		}else {
			System.out.println("Ȧ���̴�.");
		}
	}
	
	public void practice4() {
		// c��� old�� ��Ÿ�Ϸ� �ڵ�
		
		// ����� ����
		int iUserNum = 0;
		int iCandyNum = 0;
		Scanner sc = new Scanner(System.in);
		// ����� ��
		
		// �Էº� ����
		System.out.println("����� ����?");
		iUserNum = Integer.parseInt(sc.nextLine());
		
		System.out.println("������ ����?");
		iCandyNum = Integer.parseInt(sc.nextLine());
		// �Էº� ��
		
		// ��º�
		System.out.println("1�δ� ���� ���� : " + (iCandyNum / iUserNum));
		System.out.println("���� ���� ���� : " + (iCandyNum % iUserNum));
		
	}
	
	public void practice8() {
//		�ֹι�ȣ�� �Է��ϼ���(- ����) : 132456-2123456
//		����
		System.out.println("�ֹι�ȣ �Է�");
		String privateNum = sc.nextLine();
		
		for(int i =0; i < privateNum.length(); i++ ) {
			System.out.println(i + ": " + privateNum.charAt(i));
		}
		
		
		char genderChar = privateNum.charAt(7);
		if(genderChar == '1' || genderChar == '3') {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	}
	
	public void practice11() {
//		A����� ���� : 2500
//		B����� ���� : 2900
//		C����� ���� : 2600
//		A��� ����/����+a : 2500/3500.0
//		3000 �̻�
//		B��� ����/����+a : 2900/2900.0
//		3000 �̸�
//		C��� ����/����+a : 2600/2989.9999999999995
//		3000 �̸�
		
		System.out.println("A����� ���� : ");
		int salaryA = Integer.parseInt(sc.nextLine());
		System.out.println("B����� ���� : ");
		int salaryB = Integer.parseInt(sc.nextLine());
		System.out.println("C����� ���� : ");
		int salaryC = Integer.parseInt(sc.nextLine());
		
		// �μ�Ƽ�� rate
		double incentiveRateA = 0.4;
		double incentiveRateB = 0.0;
		double incentiveRateC = 0.15;
		
		double totalSalaryA = salaryA * (1.0 + incentiveRateA);
		double totalSalaryB = salaryB * (1.0 + incentiveRateB);
		double totalSalaryC = salaryC * (1.0 + incentiveRateC);
		
		
		System.out.println("A��� ����/����+a : " + salaryA+"/"+totalSalaryA);
		if(totalSalaryA >= 3000) {
			System.out.println("3000 �̻�");
		}else {
			System.out.println("3000 �̸�");
		}
		
		System.out.println("B��� ����/����+a : " + salaryB+"/"+totalSalaryB);
		if(totalSalaryB >= 3000) {
			System.out.println("3000 �̻�");
		}else {
			System.out.println("3000 �̸�");
		}
		
		System.out.println("A��� ����/����+a : " + salaryC+"/"+totalSalaryC);
		if(totalSalaryC >= 3000) {
			System.out.println("3000 �̻�");
		}else {
			System.out.println("3000 �̸�");
		}
		
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int num1 = sc.nextInt();
		System.out.print("A����� ���� : ");
		int num2 = sc.nextInt();
		System.out.print("A����� ���� : ");
		int num3 = sc.nextInt();

		double num11 = num1 + num1 * 0.4;
		double num33 = num3 + num3 * 0.15;

		System.out.println("A����� ����/����+a : " + num1 + "/" + num11);
		if (num11 >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �� ��");
		}

		System.out.println("B����� ����/����+a : " + num2 + "/" + (double) num2);
		if (num2 >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �� ��");
		}

		System.out.println("C����� ����/����+a : " + num3 + "/" + num33);
		if (num33 >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �� ��");
		}
		
		
		
	}
	

	
	
	public static void main(String[] args) {
		OperatorPractice op = new OperatorPractice();
//		op.practice1();
//		op.practice2();		
//		op.practice3();
//		op.practice4();
//		op.practice8();
		op.practice14();
		
	}
}








