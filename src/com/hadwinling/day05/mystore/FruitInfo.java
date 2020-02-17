package com.hadwinling.day05.mystore;

import java.text.SimpleDateFormat;
import java.util.Date;

/**

* 创建时间：2020年2月17日 下午8:46:20

* 项目名称：HadwingLing

* @author HadwinLing

* @version 1.0

* @since JDK 1.6.0_21

* 文件名称：FruitInfo.java

*/
public class FruitInfo {
	private double bprice;
	private double bnumber;
	private double allMoney;
	private Date openDate;
	private String bname;
	private String uname;
	
	
	/**
	 * @param bprice
	 * @param bnumber
	 * @param bname
	 * @param uname
	 */
	public FruitInfo(double bprice, double bnumber, String bname, String uname) {
		super();
		this.bprice = bprice;
		this.bnumber = bnumber;
		this.bname = bname;
		this.uname = uname;
		this.openDate = new Date();
		this.allMoney = bprice*bnumber;
		
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	public double getBnumber() {
		return bnumber;
	}
	public void setBnumber(double bnumber) {
		this.bnumber = bnumber;
	}
	public double getAllMoney() {
		return allMoney;
	}
	public void setAllMoney(double allMoney) {
		this.allMoney = allMoney;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
//	System.out.println("商品名\t价格\t数量\t总价\t购物时间");
	public String toString() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
		String open =simpleDateFormat.format(openDate);
		return  bname + "\t" + bprice + "\t" +bnumber + "\t" +
				allMoney + "\t" + open + "\t" ;
	}
	
	
	
	

}
