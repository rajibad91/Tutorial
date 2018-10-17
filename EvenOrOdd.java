package Org.totalBeginner.tutorial;

import java.util.Scanner;

public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scn.nextInt();
		checkEven(a);

	}
	
	public static void checkEven(int number)
	{
		if(number%2==0)
		{
			System.out.println(number+" is even");
		}
		else
		{
			System.out.println(number+" is odd");
		}
	}

}
