package pro0924;

import java.util.Scanner;

public class GameCaiShuZi {

	/*
	 * 生成一个随机数 1 - 100， 猜数字游戏。
	 * @version 1.0
	 * @date 0924
	 */
	public static void main(String[] args) {
		   
		// 1. 生成一个随机数
		int ranNum;
		ranNum = (int) (Math.random() * 100);
		
		// 控制台输入一个数字
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要猜的数字：");
		int inputNum = scanner.nextInt();
		
		//循环比较大小，如果相等跳出循环。
		while(inputNum != ranNum) {
			if(inputNum > ranNum) {
				System.out.println("你输入的数字大了，请重新输入。");
				inputNum = scanner.nextInt();
			}else if(inputNum < ranNum) {
				System.out.println("你输入的数字小了，请重新输入。");
				inputNum = scanner.nextInt();
			}
		}
		System.out.println("恭喜你猜对了!");

	}

}
