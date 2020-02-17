package com.hadwinling.day05.mystore;

import java.util.Scanner;


/**

* 创建时间：2020年2月17日 下午10:12:11

* 项目名称：HadwingLing

* @author HadwinLing

* @version 1.0

* @since JDK 1.6.0_21

* 文件名称：Test.java

*/
public class Test {

	/**
	
	* <p>Title: main<／p>
	
	* <p>Description: <／p>
	
	* @param args
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		boolean flag = true;
		//创建BuySystem对象
		BuySystem buySystem = BuySystem.getBuySystem();
		User user =null;
		while (flag) {
			menu();
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				//注册用户
				System.out.print("请输入密码");
				String password = input.next();
				System.out.print("请输入姓名");
				String name = input.next();
				System.out.print("请输入余额");
				double money = input.nextDouble();
				user = buySystem.register(password, name, money);
				break;
			case 2:
				//用户登录
				System.out.print("请输入账号");
				long id = input.nextLong();
				System.out.print("请输入密码");
				String password1 = input.next();

				if (buySystem.login(id, password1)!=null) {
//					登录成功
					subTest(input, buySystem,user);
				}else {
					System.out.println("登录失败");
				}
				break;
			case 3:
				//退出
				System.exit(0);
			default:
				System.out.println("输入有误，请重输");
				break;
			}
			
		}

	}	
	public static void subTest(Scanner input,BuySystem buySystem,User user) {
		boolean flag = true;
		while (flag) {
			submenu();
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				//查看
				buySystem.getAllFruit();
				break;
			case 2:
				//购买
				/**
				 * 水果名，水果数量，
				 */
				System.out.println("请输入要购买的商品");
				String fname = input.next();
				System.out.println("请输入要购买的数量");
				int fnumber = input.nextInt();
				buySystem.setBuyFruit(fname, fnumber,user);
				break;
			case 3:
				//查看购买
				buySystem.getAllBuyed(user.getName());
				break;
			case 4:
				System.out.print("确认退出？y/n");
				String string = input.next();
				if ("y".equalsIgnoreCase(string)) {
					flag = false;
					System.out.println("退出成功");
				}
				break;
			default:
				System.out.println("输入有误，请重输");
				break;
			}
			
		}
	
		
	}
	public static void menu() {
		System.out.println("*******欢迎进入超市购物系统********");
		System.out.println("1.注册用户");
		System.out.println("2.用户登录");
		System.out.println("********************************");
		System.out.print("请输入选择:");
	}
	public static void submenu() {
		System.out.println("----------------------------");
		System.out.println("1.浏览商品");
		System.out.println("2.购买商品");
		System.out.println("3.查看已购买商品");
		System.out.println("4.返回上一级");
		System.out.println("----------------------------");
		System.out.print("请输入选择:");
	}
	

}
