
package bca;

import java.util.Scanner;
public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int x=1,n,fact=1;
           Scanner s=new Scanner(System.in);
           System.out.println("Enter n value:");
           n=s.nextInt();
           do
           { fact=fact*x;
             x++;
           }while(x<=n);
        	   System.out.println(n+"Factorial is="+fact);
           
	}

}
