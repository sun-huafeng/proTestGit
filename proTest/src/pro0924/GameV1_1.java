package pro0924;

import java.awt.im.InputContext;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class GameV1_1 {
	

	/*
	 * 生成一个随机数 100 - 200， 猜数字游戏。
	 * 如果输入的数字是 0 。则输出 已经退出成功。
	 * @version 1.0
	 * @date 0924
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranNum;
		ranNum = (int) (Math.random() * 100+100);
		//System.out.println();
		Scanner a=new Scanner(System.in);
		System.out.println();
		int inputNum = a.nextInt();
		while (ranNum!=inputNum) {
			if(ranNum>inputNum)
			System.out.println("您输小了：");
			inputNum = a.nextInt();
		}	if(ranNum<inputNum) {
			System.out.println("您输大了：");
			inputNum = a.nextInt();
			
		}
		inputNum =0;
		System.out.println("已经退出成功：");
	}
		
}
