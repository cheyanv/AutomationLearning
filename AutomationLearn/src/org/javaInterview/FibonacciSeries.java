package org.javaInterview;

public class FibonacciSeries {
 public void fibUsingFor() {
	int a=0;
	int b=1;
	System.out.println(a+b);
	for (int i = 2; i < 10; i++) {
		int c;
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
			
}
	
	public static void main(String[] args) {
		FibonacciSeries fib=new FibonacciSeries();
		fib.fibUsingFor();
	}
}
