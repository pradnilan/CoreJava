package myPackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		int sum=0;
		String results;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Any Number:");
		
		num=scanner.nextInt();
		
		for (int i=0;i<=num;i++) sum+=i;
	
		
		System.out.println(sum);
		
	}

}
