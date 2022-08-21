package com.tns.framework;

public class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static final float MINBAL=0;
	public SavingAcc(int accNo, String accNm, float accBal, boolean   isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
	}
	public void withdraw(float accBal  )
	{
		System.out.println("Dear Saving account user, your account balance is:"+accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}

}
