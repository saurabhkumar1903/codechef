package com.codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Problem1

{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		float attemptedWithdrawlAmount=sc.nextFloat();
		float initialBalance=sc.nextFloat();
		float amountLeftAfterWithdrawl=initialBalance-attemptedWithdrawlAmount-0.50f;
		if(attemptedWithdrawlAmount%5==0)
		{
		    if(amountLeftAfterWithdrawl<0)
		    	System.out.printf("%.2f",initialBalance);
		    else
		    	System.out.printf("%.2f",amountLeftAfterWithdrawl);
		}
		else{
		    
			System.out.printf("%.2f",initialBalance);
		}
	}
}
