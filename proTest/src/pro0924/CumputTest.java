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
	
		int n;
		do {
		
			System.out.println("1geshu ");
			a = sc.nextInt();
			
			System.out.println("2geshu ");
			b = sc.nextInt();
			
			System.out.println("ʲô����?");
			String str = sc.next();
			/*if(str.equals("-")) {
				result = jian(a, b);
			}
			if(str.equals("/")) {
				result = chu(a, b);
			}
		
			if(str.equals("+")) {
				result = add(a, b);
			}
			if(str.equals("*")) {
				result = cheng(a, b);
			}*/
			switch (str) {
			case "-":
				result = jian(a, b);
				break;
			case "/":
				result = chu(a, b);
				break;
			case "+":
				result = add(a, b);
				break;
			case "*":
				result = cheng(a, b);
				break;
			default:
				System.out.println("�밴��ָ�� ");
				break;
			}
			
			System.out.println("�����:" + result);
			System.out.println("�㻹Ҫ����ô��1���� 0 �˳� ");
			
			n = sc.nextInt();
		
		} while (n == 1);
		
	}
	

	private static int add(int a, int b) {
		return a+b;
	}
	private static int jian(int a, int b) {
		return a-b;
	}
	private static int chu(int a, int b) {
		return a/b;
	}
	private static int cheng(int a, int b) {
		return a*b;
	}	
}