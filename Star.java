package Org.totalBeginner.tutorial;

import java.util.Scanner;

public class Star {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("How many stars u want");
		int a=scn.nextInt();
		
		for (int i=1;i<=a;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
