package Org.totalBeginner.tutorial;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="MADAm";
		System.out.println("Original string is: "+s);
		char[] c=s.toCharArray();
		StringBuilder sb=new StringBuilder();
//		for(int i=0; i<c.length;i++)
//		{
//			System.out.println(c[i]);
//			sb.append(c[i]);
//		}
		
		for(int i=c.length-1;i>=0;i--)
		{
			sb.append(c[i]);
		}

		System.out.println(" reverse String is: "+sb);
		
		if(s.equalsIgnoreCase(sb.toString()))
		{
			System.out.println(s+" is palindrome.");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
