package Org.totalBeginner.tutorial;

public class Person {
	//fields
	private String name;
	private int maximumBooks;
	
	public static void main (String []args)
	{
	System.out.println("Hello World");
	System.out.println("RLD");
	
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}
}
