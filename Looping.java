package Org.totalBeginner.tutorial;

public class Looping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=20;i++)
		{
			System.out.println("For Loop "+i);
		}
		int j=0;
		while(j<10)
		{
			j++;
			System.out.println("While Loop "+j);
		}	
		
		int k=0;
		do
		{
			k++;
			System.out.println(" do While Loop "+k);
			
		}while(k<10);
		
		
		int arr[]={1,2,3,4};
		for (int a : arr) {
			System.out.println(" for each loop "+a);
			
		}

	}

}
