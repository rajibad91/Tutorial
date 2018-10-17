package Org.totalBeginner.tutorial;

import java.util.Scanner;

public class IfElseIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Mark");
		int a=scn.nextInt();
		if(a<50)
			System.out.println("Third Division");
		else if(a>=50&&a<70)
			System.out.println("Second Division");
		else if(a>=70&&a<=100)
			System.out.println("First Division");
		else
			System.out.println("Invalid marks");
	}

}
