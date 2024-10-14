package bca;

public class Subclass extends Superclass{
	
	
		
	int NUM;
	public Subclass(int a, int b)
	{
		super(a);
		this.NUM=b;
	}
	
	public void display()
	{
		System.out.println("in superclass,num"+super.NUM);
		System.out.println("in subclass,num="+NUM);
	}

}
