package com.kh.homework;

import java.util.Scanner;

public class StudentInfoManager {
	public static void main(String[] args) {
		// �л����� ���� ���α׷��Դϴ�.
		// �л��� �̸�, ����, �ּ�, �г�, ����(�Ҽ��� ���� ����) �Է� �޾��ּ���.
		// ��� ������ �Է¹����� ����ϴ� ����� ����� �ּ���.
		// ������ ���� �Է��Ҽ� �ִ� Interface�� �ۼ����ּ���.
		
		String name = null;
		int age = 0;
		String address = null;
		int grade = 1;
		double transcript = 0.0; // ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�(��)�� �Է��ϼ���.");
		name = sc.nextLine();
		
		System.out.println("����(��)�� �Է��ϼ���.");
		age = sc.nextInt();
		
		System.out.println("�ּ�(��)�� �Է��ϼ���.");
		address = sc.nextLine();
		
		System.out.println("�г�(��)�� �Է��ϼ���.");
		grade = sc.nextInt();
		
		System.out.println("����(��)�� �Է��ϼ���.");
		transcript = sc.nextDouble();
		
		System.out.println("----------�л� ����-----------");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("�г� : " + grade);
		System.out.println("���� : " + transcript);
	}
}
