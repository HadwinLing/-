package com.hadwinling.day05.mystore;

/**

* 创建时间：2020年2月17日 下午8:44:28

* 项目名称：HadwingLing

* @author HadwinLing

* @version 1.0

* @since JDK 1.6.0_21

* 文件名称：Fruit.java

*/
public class Fruit {
	private String fname;
	private double fprice;
	private int allNumber;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	

	public int getAllNumber() {
		return allNumber;
	}
	public void setAllNumber(int allNumber) {
		this.allNumber = allNumber;
	}
	/**
	 * @param fname
	 * @param fprice
	 * @param all
	 */
	public Fruit(String fname, double fprice, int allNumber) {
		super();
		this.fname = fname;
		this.fprice = fprice;
		this.allNumber = allNumber;
	}
	@Override
	public String toString() {
		return fname + "\t" + fprice + "\t" +allNumber+ "\t" ;
	}
	
}
