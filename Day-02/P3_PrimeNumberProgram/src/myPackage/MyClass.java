package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		String results;
		int counter=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Any Number:");
		
		num=scanner.nextInt();
		
		for(int i=1;i<=num;i++)
			if(num%i==0) counter+=1;
		if (counter==2)System.out.println(num+" is a prime number");
		else System.out.println(num+" is not a prime number");
		
		
	}

}
