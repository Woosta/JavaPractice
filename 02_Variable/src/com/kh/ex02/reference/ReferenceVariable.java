package com.kh.ex02.reference;

public class ReferenceVariable {
	
	// ������(Reference Type) -> Pointer
	// ���� ���� ���� �ʰ�, �ּ� ����ġ�� �ּ� ���� ���� ���� ex) 0x0100 -> ���� �ִ� �ּ���
	// ��ü�� �����ҽ� ��ü�� heap�� ������ �Ǵµ�, �� ���� �ִ� ��ü�� �����ϱ� ���Ͽ� ����� ��.
	// �а� ��� : indirect / �����̶�� ǥ������ ���
	// �������� �ּҰ��� �����ϴ� �������� ���� �޸��� �ּ� ũ�⸦ ���µ�.
	// OS - 32bit / 64bit
	
	// ������=Class�� Ư¡(�⺻���� �ٸ�)
	// 1. �⺻���� ������ Java�� ��� ������ �������̴�.
	// 2. �������� Type�� �빮�ڷ� �����Ѵ�. (����ڰ� ���� ������=class�� �ҹ��ڷ� ���� �����ϳ� �� �����̴�.)
	// 3. �������� null �ʱ�ȭ�� �����ϴ�.
	// 4. �������� ��κ��� new�� ���� �����ϰ� heap�� ����ȴ�.
	//    -> ���� new�� ���� ���� �ʴ� Ŭ������ �ִ�. (�Ĺݺο� �˷���. ���� : �׷��� �����ؼ�)
	// 5. ��� �������� Object�� ����Ѵ�. (Object�� ��� Ŭ������ �θ��̴�.)
	
	public static void main(String[] args) {
		String str1 = null;
		String str2 = "�ȳ��ϼ���?"; // ���ڿ��� Ư���ϰ� new�� �Ƚᵵ ���� ����. ������ Ư���ϴϱ�.
		String str3 = new String("�ȳ��ϼ���?");
		
		Integer intVal1 = null;
		Integer intVal2 = 31;
		Integer intVal3 = new Integer(31); // deprecated = ������ ���� �������� ����
		
		Object obj = new Object();
		System.out.println(obj.hashCode());
		System.out.println(intVal2.hashCode());
		System.out.println(str2.hashCode());
		
	}
}
