
package bca;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);
           System.out.println("Enter a number");
           int number =scanner.nextInt();
           scanner.close();
           
           int originalNumber = number;
           int reversednumber = 0;
           while(number !=0) {
        	   int remainder = number %10;
        	   reversednumber = reversednumber * 10 + remainder;
        	   number /=10;
           }
           if(originalNumber == reversednumber) {
        	   System.out.println(originalNumber + " is a palindrome");
           
           }else {
        	   System.out.println(originalNumber + "is not  a palindrome");
           }
           
	}

}
