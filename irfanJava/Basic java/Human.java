package bca;

public class Human {
	
	      public static void main(String args[])
	        {
	            Person p = new Person("Prerna");
	            Mother m = new Mother("Mahima");
	            Wife w = new Wife("Raani");
	            System.out.println("p is a " + p.name);
	            System.out.println("m is a " + m.name);
	            System.out.println("w is a " + w.name);
	            m.withChildren();
	            w.CallHusband();
	        }
	  }




