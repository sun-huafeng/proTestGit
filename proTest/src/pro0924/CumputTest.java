package pro0924;

import java.util.Scanner;

public class CumputTest {

	private static Scanner sc;

	/*
	 * add ���
	 * ���� + - * /
	 */
	public static void main(String[] args) {
		
		int a;
		int b;
		int result = 0;
		
		sc = new Scanner(System.in);
		
		System.out.println("��ӭ:");
		
		System.out.println("1geshu ");
		a = sc.nextInt();
		
		System.out.println("2geshu ");
		b = sc.nextInt();
		
		System.out.println("ʲô����?");
		String str = sc.next();
		
		if(str.equals("+")) {
			result = add(a, b);
		}
		
		
		System.out.println("�����:" + result);
	}

	private static int add(int a, int b) {
		return a+b;
	}

}
