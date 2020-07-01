package com.wipro.Inheritance;

public class Employee extends Person {
	
	private double annual_salary;
	private int emp_yr;
	private String insurance_nmbr;
	
	public Employee(String n,double a,int yr,String nmbr){
		super(n);
		this.annual_salary=a;
		this.emp_yr=yr;
		this.insurance_nmbr=nmbr;
	}
	
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getEmp_yr() {
		return emp_yr;
	}
	public void setEmp_yr(int emp_yr) {
		this.emp_yr = emp_yr;
	}
	public String getInsurance_nmbr() {
		return insurance_nmbr;
	}
	public void setInsurance_nmbr(String insurance_nmbr) {
		this.insurance_nmbr = insurance_nmbr;
	}
	
	public String toString() {
		return super.toString()+" "+annual_salary+" "+emp_yr+" "+insurance_nmbr;
	}
}