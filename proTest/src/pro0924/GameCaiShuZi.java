package pro0924;

import java.util.Scanner;

public class GameCaiShuZi {

	/*
	 * ����һ������� 1 - 100�� ��������Ϸ��
	 * @version 1.0
	 * @date 0924
	 */
	public static void main(String[] args) {
		   
		// 1. ����һ�������
		int ranNum;
		ranNum = (int) (Math.random() * 100);
		
		// ����̨����һ������
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫ�µ����֣�");
		int inputNum = scanner.nextInt();
		
		//ѭ���Ƚϴ�С������������ѭ����
		while(inputNum != ranNum) {
			if(inputNum > ranNum) {
				System.out.println("����������ִ��ˣ����������롣");
				inputNum = scanner.nextInt();
			}else if(inputNum < ranNum) {
				System.out.println("�����������С�ˣ����������롣");
				inputNum = scanner.nextInt();
			}
		}
		System.out.println("��ϲ��¶���!");

	}

}
