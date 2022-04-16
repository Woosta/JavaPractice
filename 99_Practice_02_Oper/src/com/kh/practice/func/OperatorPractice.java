package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	// 글로벌로 Scanner 사용하기
	public static Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요
		System.out.println("정수 : ");
		System.out.println(Integer.parseInt(sc.nextLine()) > 0 ? "양수다" : "양수가 아니다" );
	}
	
	public void practice2(){
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		System.out.println("정수 : ");
		int val = 0;
		System.out.println((val = Integer.parseInt(sc.nextLine())) > 0 ? "양수다" : (val == 0 ? "0이다" : "음수다"));
	}

	public void practice3(){
		System.out.println("숫자 입력 : ");
		int value = Integer.parseInt(sc.nextLine());

		if(value % 2 == 0) {
			System.out.println("짝수이다.");
		}else {
			System.out.println("홀수이다.");
		}
	}
	
	public void practice4() {
		// c언어 old한 스타일로 코딩
		
		// 선언부 시작
		int iUserNum = 0;
		int iCandyNum = 0;
		Scanner sc = new Scanner(System.in);
		// 선언부 끝
		
		// 입력부 시작
		System.out.println("사람의 수는?");
		iUserNum = Integer.parseInt(sc.nextLine());
		
		System.out.println("사탕의 수는?");
		iCandyNum = Integer.parseInt(sc.nextLine());
		// 입력부 끝
		
		// 출력부
		System.out.println("1인당 사탕 개수 : " + (iCandyNum / iUserNum));
		System.out.println("남는 사탕 개수 : " + (iCandyNum % iUserNum));
		
	}
	
	public void practice8() {
//		주민번호를 입력하세요(- 포함) : 132456-2123456
//		여자
		System.out.println("주민번호 입력");
		String privateNum = sc.nextLine();
		
		for(int i =0; i < privateNum.length(); i++ ) {
			System.out.println(i + ": " + privateNum.charAt(i));
		}
		
		
		char genderChar = privateNum.charAt(7);
		if(genderChar == '1' || genderChar == '3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	public void practice11() {
//		A사원의 연봉 : 2500
//		B사원의 연봉 : 2900
//		C사원의 연봉 : 2600
//		A사원 연봉/연봉+a : 2500/3500.0
//		3000 이상
//		B사원 연봉/연봉+a : 2900/2900.0
//		3000 미만
//		C사원 연봉/연봉+a : 2600/2989.9999999999995
//		3000 미만
		
		System.out.println("A사원의 연봉 : ");
		int salaryA = Integer.parseInt(sc.nextLine());
		System.out.println("B사원의 연봉 : ");
		int salaryB = Integer.parseInt(sc.nextLine());
		System.out.println("C사원의 연봉 : ");
		int salaryC = Integer.parseInt(sc.nextLine());
		
		// 인센티브 rate
		double incentiveRateA = 0.4;
		double incentiveRateB = 0.0;
		double incentiveRateC = 0.15;
		
		double totalSalaryA = salaryA * (1.0 + incentiveRateA);
		double totalSalaryB = salaryB * (1.0 + incentiveRateB);
		double totalSalaryC = salaryC * (1.0 + incentiveRateC);
		
		
		System.out.println("A사원 연봉/연봉+a : " + salaryA+"/"+totalSalaryA);
		if(totalSalaryA >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		
		System.out.println("B사원 연봉/연봉+a : " + salaryB+"/"+totalSalaryB);
		if(totalSalaryB >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		
		System.out.println("A사원 연봉/연봉+a : " + salaryC+"/"+totalSalaryC);
		if(totalSalaryC >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		System.out.print("A사원의 연봉 : ");
		int num2 = sc.nextInt();
		System.out.print("A사원의 연봉 : ");
		int num3 = sc.nextInt();

		double num11 = num1 + num1 * 0.4;
		double num33 = num3 + num3 * 0.15;

		System.out.println("A사원의 연봉/연봉+a : " + num1 + "/" + num11);
		if (num11 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미 만");
		}

		System.out.println("B사원의 연봉/연봉+a : " + num2 + "/" + (double) num2);
		if (num2 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미 만");
		}

		System.out.println("C사원의 연봉/연봉+a : " + num3 + "/" + num33);
		if (num33 >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미 만");
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








