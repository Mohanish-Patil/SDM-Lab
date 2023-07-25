package com.tester;

import java.util.Scanner;

public abstract class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter three numbers :");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int num3=sc.nextInt();
			
			
			System.out.println("Largest of three numbers is : "+LargestOfThreeNumbers(num1,num2,num3));
			System.out.println("Sum of three numbers is : "+sumOfThreeNumbers(num1, num2, num3));
		}

	}
	
	public static int sumOfThreeNumbers(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	
	public static int LargestOfThreeNumbers(int n1,int n2,int n3) {
		if(n1>=n2 && n1>=n3) {
			return n1;
		}else if(n2>=n1 && n2>=n3) {
			return n2;
		}else {
			return n3;
		}
	}

}