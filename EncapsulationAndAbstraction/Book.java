package com.wipro.EncapsulationAndAbstraction;

public class Book {
	private String title;
	private  Author a;
	private double price;
	private int qtyInstock;
	Book(String title,Author a,double price,int qtyInstock){
		this.title=title;
		this.a=a;
		this.price=price;
		this.qtyInstock=qtyInstock;
	}
	public String gettitle() {
		return title;
	}
	public Author getA(){
		return a;
	}
	public double getprice() {
		return price;
	}
	public int getqtyInstock() {
		return qtyInstock;
	}

}
