package com.hadwinling.day05.mystore;

/**

* 创建时间：2020年2月17日 下午10:06:27

* 项目名称：HadwingLing

* @author HadwinLing

* @version 1.0

* @since JDK 1.6.0_21

* 文件名称：User.java

*/
public class User {
	private static long sid =10000 ;
	private long id;
	private String password;
	private String  name;
	private double money;
	/**
	 * @param id
	 * @param password
	 * @param name
	 */
	public User( String password, String name,double money) {
		super();
		this.id = ++sid;
		this.password = password;
		this.name = name;
		this.money = money;
	}
	public long getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "id=" + id + ", password=" + password + ", name=" + name +", money="+money;
	}
	
}
