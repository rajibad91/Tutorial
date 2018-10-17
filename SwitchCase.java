package Org.totalBeginner.tutorial;

import java.util.Scanner;

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number for the Month");
		int a=scn.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("You have entered no for January");
			break;
		case 2:
			System.out.println("You have entered no for February");
			break;
		case 3:
			System.out.println("You have entered no for March");
			break;
		case 4:
			System.out.println("You have entered no for April");
			break;
		case 5:
			System.out.println("You have entered no for May");
			break;
		case 6:
			System.out.println("You have entered no for June");
			break;
		case 7:
			System.out.println("You have entered no for July");
			break;
		case 8:
			System.out.println("You have entered no for August");
			break;
		case 9:
			System.out.println("You have entered no for September");
			break;
		case 10:
			System.out.println("You have entered no for October");
			break;
		case 11:
			System.out.println("You have entered no for November");
			break;
		case 12:
			System.out.println("You have entered no for December");
			break;
			default :
				System.err.println("enter a valid no for month");
		}

	}

}
