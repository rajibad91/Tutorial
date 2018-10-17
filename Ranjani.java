package Org.totalBeginner.tutorial;


import java.util.*;

public class Ranjani {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N >= 2 & N <= 20) 
        {
            for(int i=1; i<11; i++)
            {
                System.out.print(N +"*" +i+"="+  N*i);
                //System.out.println("\n");
                }
           //System.out.println();
            }
    }
} 
 
