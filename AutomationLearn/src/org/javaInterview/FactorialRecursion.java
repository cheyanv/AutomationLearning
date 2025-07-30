package org.javaInterview;

import java.util.Scanner;

public class FactorialRecursion {
	
	
	public void recursion(int s){
	int sec_value=s;
	for (int i = s-1; i > 1; i--) {
		if (i!=1) {
		//	System.out.println(i);
			sec_value=sec_value*i;
		//	System.out.println(sec_value );
		}
	}
	 System.out.println("The recursion Value "+sec_value);
	}
	public int RecursiveValu(int n) {
		if (n==1) {
			return 1;
		}
		return n * RecursiveValu(n-1);
	}
	public void swapnumber() {
		int a=20;
		int b=45;
		System.out.println("Where a = "+a+"Where b ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Where a = "+a+"Where b ="+b);
	}
	
public static void main(String[] args) {
	FactorialRecursion fac=new FactorialRecursion();
	System.out.println("Enter the FactorialRecursion");
	 Scanner scan_var=new Scanner(System.in);
	 int Fac_rec = scan_var.nextInt();
	int recursiveValu = fac.RecursiveValu(Fac_rec);
	System.out.println("The recursive Value "+ Fac_rec+ ' ' +"Value "+ recursiveValu);
	fac.recursion(Fac_rec);
	fac.swapnumber();
}
}