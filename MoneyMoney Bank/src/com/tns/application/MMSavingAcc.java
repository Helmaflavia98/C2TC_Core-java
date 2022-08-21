package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL=0;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal,isSalary);
	
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Dear Saving account user, your account balance is:"+accBal);
	}
	
	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
