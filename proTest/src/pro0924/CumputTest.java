package pro0924;

import java.util.Scanner;

public class CumputTest {

	private static Scanner sc;

	/*
	 * add 求和
	 * 法则 + - * /
	 */
	public static void main(String[] args) {
		
		int a;
		int b;
		int result = 0;
		
		sc = new Scanner(System.in);
		
		System.out.println("欢迎:");
		
		System.out.println("1geshu ");
		a = sc.nextInt();
		
		System.out.println("2geshu ");
		b = sc.nextInt();
		
		System.out.println("什么法则?");
		String str = sc.next();
		
		if(str.equals("+")) {
			result = add(a, b);
		}
		
		
		System.out.println("结果是:" + result);
	}

	private static int add(int a, int b) {
		return a+b;
	}

}
