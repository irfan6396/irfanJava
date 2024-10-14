package bca;

public class Person {

	     String name;
	     Person(String n)
	      {
	        name = "Person:  " + n;
	      }
	   }
	class Mother extends Person
	  {
	     Mother(String n)
	     {
	       super(n);
	       name = "Mother:  " + n;
	     }
	  void withChildren()
	    {
	       System.out.println(name + " is playing with the kids ...");
	    }
	 }
	class Wife extends Person
	  {
	    Wife(String n)
	     {
	         super(n);
	         name = "Wife:  " + n;
	      }
	  void CallHusband()
	   {
	      System.out.println(name + " is calling the husband ...");
	   }
	}
