package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public static Scanner sc = new Scanner(System.in);
//	아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
//	종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
//	ex.
//	1. 입력
//	2. 수정
//	3. 조회
//	4. 삭제
//	7. 종료
//	메뉴 번호를 입력하세요 : 3
//	조회 메뉴입니다.
	public void practice1(){
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : " );
		int menuNum = Integer.parseInt(sc.nextLine());
		
		switch(menuNum) {
			case 1 : System.out.println("입력 메뉴입니다"); break;	
			case 2 : System.out.println("수정 메뉴입니다"); break;
			case 3 : System.out.println("조회 메뉴입니다"); break;
			case 4 : System.out.println("삭제 메뉴입니다"); break;
			case 7 : System.out.println("종료 메뉴입니다"); break;
			default : System.out.println("없는 메뉴입니다."); break;
		}
	}
//	키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
//	짝수가 아니면 “홀수다“를 출력하세요.
//	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
//	ex.
//	숫자를 한 개 입력하세요 : -8
//	양수만 입력해주세요
	public void practice2(){
		System.out.print("숫자를 한 개 입력하세요 : " );
		int num = Integer.parseInt(sc.nextLine());
	
		if(num < 0) {
			System.out.println("양수만 입력해주세요.");
		} else if(num % 2 == 0) {
			System.out.println("짝수다.");
		}else {
			System.out.println("홀수다.");
		}
	}
	
	/*
	 * ex 1. ex 2.
		국어점수 : 88
		수학점수 : 50 
		영어점수 : 40 
		불합격입니다. 
		
		영어점수 : 45
	    수학점수 : 50
 		국어점수 : 88
		수학 : 50
		영어 : 45
		합계 : 183
		평균 : 61.0
		축하합니다, 합격입니다!
	 */
	public void practice3(){
		System.out.print("국어점수 : ");
		int korScore = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학점수 : ");
		int mathScore = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어점수 : ");
		int engScore = Integer.parseInt(sc.nextLine());
		
		if(korScore < 40 || mathScore < 40 || engScore < 40) {
			System.out.println("과락으로 불합격입니다.");
			return;
		}

		int totalScore = korScore + mathScore + engScore;
		double avgScore = totalScore / 3.0;
		
		if(avgScore < 60.0) {
			System.out.println("평균 불합격입니다.");
		}else {
			System.out.println("합계 : " + totalScore);
			System.out.println("평균 : " + avgScore);
			System.out.println("합격입니다. ");
		}
		
	}
	
	public static void main(String[] args) {
		ControlPractice cp = new ControlPractice();
//		cp.practice1();
//		cp.practice2();
		cp.practice3();
	}
}
