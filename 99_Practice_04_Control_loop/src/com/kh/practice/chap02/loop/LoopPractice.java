package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public static Scanner sc = new Scanner(System.in);
	
	
//	1이상의 숫자를 입력하세요 : 4  1이상의 숫자를 입력하세요 : 0
//	1 2 3 4                  1 이상의 숫자를 입력해주세요.
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
	}
	
	public void practice2() {
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num <= 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
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
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num <= 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			
			// 첫번째 꺼구로
			for(int i = 1; i <= num; i++) {
				System.out.print((num - i + 1) +" ");
			}
			
			System.out.println();

			// 두번째 꺼구로 - i를 감소시키는 문장
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
