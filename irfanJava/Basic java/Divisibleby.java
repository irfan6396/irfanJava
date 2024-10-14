package bca;
import java.util.Scanner;


public class Divisibleby {
	  
		    static void result(int N)
		    {     
		        // iterate from 0 to N
		       for (int num = 0; num < N; num++)
		        {     
		            // Short-circuit operator is used 
		            if (num % 3 == 0 && num % 5 == 0)
		                System.out.print(num + " ");
		        }
		    }
		      
		    // Driver code
		    public static void main(String []args)
		    {
		        // input goes here
		    int N=100;
		        System.out.println("Enter number");
		        Scanner in =new Scanner(System.in);
		          
		        // Calling function
		      result(N);
		    }
		
	}


