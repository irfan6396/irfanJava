package bca;
import java.util.Scanner;
public interface Stax {
       double statetax();
       
}
class Punjab implements Stax{
	 public double statetax()
	 {
		 return 3000.0;
		 
	 }
}
class Hp implements Stax{
	public double statetax()
	{
		return 1000.0;
	}
	
}
class Tax{
	public static void main(String[] args)
	throws ClassNotFoundException, IllegalAccessException, InstantiationException
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the state name");
		String state =sc.next();
		Class c=Class.forName(state);
		Stax ref = (Stax)c.newInstance();
		calculatetax(ref);
		
	}
	static void calculatetax(Stax t)
	{
		double ct =2000.0;
		double st=t.statetax();
		double totaltax=st+ct;
		System.out.println("total tax=" + totaltax);
		
	}
}