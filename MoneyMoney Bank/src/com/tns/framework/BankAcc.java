package com.tns.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	public int getAccNo()
	{
		return accNo;
	}
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	public String getAccNm()
	{
		return accNm;
	}
	public void setAccNm(String accNo)
	{
		this.accNm = accNm;
	}
	public float getAccBal()
	{
		return accBal;
	}
	public void setAccBal(float accBal)
	{
		this.accBal = accBal;
	}
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Amount is withdrawn and account balance is :"+accBal);
	}
	public void deposite(float  accBal)
	{
		System.out.println("Amount is deposited succesfully and account balance is :"+accBal);
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	

}
