package bca;
import java.io.*;
public class Student1 {
	int rollno;
	String name;
	float fee;
	public Student1 (int rollno, String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student1 s1=new Student1(111,"Sakshi",4000);
        s1.display();
	}

}
