package pro0924;

import java.util.Scanner;

public class GameV1_1 {

	/*
	 * ����һ������� 100 - 200�� ��������Ϸ�� �������������� 0 ������� �Ѿ��˳��ɹ���
	 * 
	 * @version 1.0
	 * 
	 * @date 0924
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranNum;
		ranNum = (int) (Math.random() * 100 + 100);
		System.out.println("������:");
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		int inputNum = a.nextInt();
		
			while (ranNum != inputNum) {
				if (inputNum == 0) {
					System.out.println("�Ѿ��˳��ɹ���");
					break;
				}
				if (ranNum > inputNum) {
					System.out.println("����С�ˣ�");
					inputNum = a.nextInt();

				}
				if (ranNum < inputNum) {
					System.out.println("������ˣ�");	
					inputNum = a.nextInt();
				}

			}
			

	}
}
