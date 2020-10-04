package pkg;

import java.util.Scanner;

public class ClassA 
{
	
	public void method1(int a,int b)
	{
		int c;
		c=a+b;
		
		System.out.println("The value of c is:"+c);
	}

	public static void main(String[] args) 
	{
		
	System.out.println("Enter the value of a:");	
		
	Scanner x= new Scanner(System.in);
	int u= x.nextInt();
	
	System.out.println("Enter the value of b:");	
	
	
	Scanner y= new Scanner(System.in);
	int v= y.nextInt();
		
	
	ClassA obj = new ClassA();
	obj.method1(u, v);


	}

}
