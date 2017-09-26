package pro0926;

import java.util.Scanner;

public class Computer {
	
	private static Scanner sc;
	/*
	 * 计算器  V_1_2
	 * 实现开始运行程序在控制台打出欢迎页面，
	 * 并且提示用户输入start命令开始计算器、输入end指令结束计算器，（运用计算器过程中 只要用户输入end 就会退出系统）
	 * 当用户输入其他指令的时候，控制台提示“指令有误，请重新输入。”
	 * 开始游戏后提示用户输入第一个要运算的数字（数字可以是double类型）
	 * 当用户输入第一个数字后判断如果不是数字，提示用户请输入数字，
	 * 输入的是可以运算的数字时，提示请输入第二个数字，同样不是数字时提醒用户并重新输入。
	 * 然后提示输入运算法则 + - * /   如果不是运算符号中的一种提醒用户按照指令并重新输入。
	 * 最后显示运算结果。然后提示用户是否继续运算，用户输入yes 后开始新的运算。除了yes以外的就会推出系统。
	 */
	public void doComputer() {
		boolean isOrder = false;
		
		System.out.println("---------------欢迎进入计算机系统 ：------------- ");
		System.out.println("请根据提示输入指令 ： start 开始运行计算机； end 退出计算机系统");
		
		sc = new Scanner(System.in);
		String nextOrder = sc.next();
		
		while (!isOrder) {
			if("start".equals(nextOrder)) {
				isOrder = true;
				System.out.println("-----------您已经成功进入系统----------");
				do {
					nextOrder = startComputer();
				}while("continue".equals(nextOrder));

				System.out.println("-----------您已经成功退出系统----------");
			}else if("end".equals(nextOrder)){
				isOrder = true;
				System.out.println("-----------您已经成功退出系统----------");
			}else {
				System.out.println("指令有误，请重新输入 :");
				nextOrder = sc.next();
			}
		}
	}
	private String startComputer() {
		
		boolean isOrder = true;
		
		double firstNum = 0.0;
		
		double seCNum = 0.0;
		
		String order = "";
		
		String operator;
		
		double result = 0.00;
		
		System.out.println("请您输入第一个要计算的数字！ ");
		
		while (isOrder) {
			try {
				order = sc.next();
				firstNum = Double.valueOf(order);
				isOrder = false;
			} catch (NumberFormatException e) {
				if("end".equals(order)) {
					return "exit";
				}else {
					System.out.println("请您输入可以运算的数字！ ");
				}
			}
		}
		
		isOrder = true;
		System.out.println("请您输入第二个要计算的数字！");
		while (isOrder) {
			try {
				order = sc.next();
				seCNum = Double.valueOf(order);
				isOrder = false;
			} catch (NumberFormatException e) {
				if("end".equals(order)) {
					return "exit";
				}else {
					System.out.println("请您输入可以运算的数字！ ");
				}
			}
		}
		
		isOrder = true;
		System.out.println("请您输入运算法则!");
		
		while (isOrder) {
			operator = sc.next();
			switch (operator) {
			case "-":
				result = firstNum - seCNum;
				isOrder = false;
				break;
			case "/":
				result = firstNum / seCNum;
				isOrder = false;
				break;
			case "+":
				result = firstNum + seCNum;
				isOrder = false;
				break;
			case "*":
				result = firstNum * seCNum;
				isOrder = false;
				break;
			case "end":
				return "exit";
			default:
				System.out.println("请您输入正确的运算符号！ ");
				break;
			}
		}
		
		System.out.println("您的运算结果是 :" + result);
		System.out.println("输入“yes”进行下一次运算，其他指令则退出系统！");
		order = sc.next();
		if("yes".equals(order)) {
			return "continue";
		}else {
			return "exit";
		}
	}

}
