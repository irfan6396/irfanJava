package bca;

public class Object {
int x=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object t=new Object();
		Object s=new Object();
		Object y=new Object();
		
		s.x=t.x+5;
		t.x=s.x+5;
        System.out.println(s.x);
        System.out.println(t.x);


		

	}

}
