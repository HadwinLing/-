package com.hadwinling.day05.mystore;

import java.util.ArrayList;
import java.util.List;







/**

* 创建时间：2020年2月17日 下午10:07:38

* 项目名称：HadwingLing

* @author HadwinLing

* @version 1.0

* @since JDK 1.6.0_21

* 文件名称：BuySystem.java

*/
public class BuySystem {
	private static List<User> users = new ArrayList<User>() ;
	private static List<Fruit> fruits = new ArrayList<Fruit>();
	private static List<FruitInfo>fruitInfos = new ArrayList<FruitInfo>();
	private static BuySystem buySystem;
	public static BuySystem getBuySystem() {
		if (buySystem==null) {
			buySystem = new BuySystem();
		}
		return buySystem;
	}
	/**
	 * 
	 */
	public BuySystem() {
		// TODO Auto-generated constructor stub
		Fruit f1 =  new Fruit("苹果", 5.9, 100);
		Fruit f2 =  new Fruit("香蕉", 5.9, 100);
		Fruit f3 =  new Fruit("橙子", 5.9, 100);
		Fruit f4 =  new Fruit("西瓜", 5.9, 100);
		Fruit f5 =  new Fruit("车厘子", 59, 100);
		
		fruits.add(f1);
		fruits.add(f2);
		fruits.add(f3);
		fruits.add(f4);
		fruits.add(f5);
	}
	
	
	/**
	 * 注册
	 */
	public User register(String password,String name,double money) {
		User user = new User(password, name, money);
		//加入到集合中
		users.add(user);
		System.out.println("注册成功");
		System.out.println(user);
		return user;
	}
	/**
	 * 登录
	 */
	public User login(long id,String password) {
		for (int i = 0; i < users.size(); i++) {
			if (id==users.get(i).getId() && password.equals(users.get(i).getPassword())) {
				System.out.println("登录成功");
				return users.get(i);
			}
		}
		System.out.println("登录失败");
		return null;
	}
	/**
	 * 查找所有商品
	 */
	public void getAllFruit() {
		System.out.println("商品名\t价格\t数量");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
	}
	/**
	 * 购买
	 * 水果名，数量
	 * 购买者
	 */
	public void setBuyFruit(String fname,int fnumber,User user) {
		for (int i = 0; i<fruits.size(); i++) {
			if (fname.equals(fruits.get(i).getFname())) {
				if (fruits.get(i).getAllNumber()>=fnumber) {
					if (user.getMoney()>=fnumber*fruits.get(i).getFprice()) {
						System.out.println("购买成功");
//						public FruitInfo(double bprice, double bnumber, String bname, String uname) {
						FruitInfo fruitInfo1 = new FruitInfo(fruits.get(i).getFprice(), fnumber, fname,user.getName());
						fruitInfos.add(fruitInfo1);
					}else {
						System.out.println("余额不足");
						return;
					}
				}else {
					System.out.println("库存不足");
					return;
				}
			}
		}
	}
	/**
	 * 查询已购买的
	 */
	public void getAllBuyed(String name) {
		if (fruitInfos.size()==0) {
			System.out.println("没有购买记录");
		}else {
			System.out.println("商品名\t价格\t数量\t总价\t购物时间");
			for (int i = 0; i < fruitInfos.size(); i++) {
				if (name .equals(fruitInfos.get(i).getUname())) {
					System.out.println(fruitInfos.get(i));
				}
			}
		}
	}

}
