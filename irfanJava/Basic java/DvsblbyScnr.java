package bca;

import java.util.Scanner;

public class DvsblbyScnr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=s.nextInt();
		if(x%5==0 && x%3==0)
		 System.out.println("It is divisible by both 5 and 3");
		else if(x%3==0) 
			System.out.println("It is divisible by 3");
		else if(x%5==0)
		    System.out.println("It is divisible by  5");
		else 
			System.out.println("It is not divisible by 5 an 3");
		
	}
}
