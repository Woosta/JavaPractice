package com.kh.ex04.overflow;

public class OverflowTest { // Overflow = 넘침,홍수
	public static void main(String[] args) {
		byte temp = 125;
		System.out.println(++temp);
		System.out.println(++temp);
		System.out.println(++temp);
		System.out.println(++temp);
		// 의도하지 않은 overflow...
		
		// 300이 도달되지 않아 무한 반복됨
		for(byte i = 0; i < 300; i++) {
			System.out.println(++temp);
		}
		
	}
}
