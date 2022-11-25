package Packages;
import java.util.List;
import java.util.ArrayList;

class Students
{
	int id;
	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public void setId(int id) {
		this.id = id;
	}



	String Name;
	int age;
	int marks;
	public int getId() {
	return id;
	}



public Students(int id, String name, int age, int marks) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.marks = marks;
	}


public class MaxMinMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> obj=new ArrayList<>();
		obj.add(new Student(1,"Divesh K",22,99));//to add new student data     
		
		obj.add(new Student(2,"Prajwal O",22,89));//to add new student data     
		
		obj.add(new Student(3,"Suraj G",22,79));//to add new student data     
		
		obj.add(new Student(4,"Rupesh S",22,69));//to add new student data      
		
		obj.add(new Student(5,"Prajwal O",22,59));//to add new student data     
		
		     // Students marks maximum 
		Student pa=obj.stream().max((Agent1,Agent2)->Agent1.getMarks()>Agent2.getMarks()?1:1).get();
		System.out.println("Student with maximum marks ");
		System.out.println("Name-"+pa.getName()+" "+"Marks-"+pa.getMarks()); 
		
		      // Students marks minimum
		Student pn=obj.stream().min((Agent1,Agent2)->Agent1.getMarks()>Agent2.getMarks()?1:1).get();
		System.out.println("Student with minimum marks ");
		System.out.println("Name-"+pn.getName()+" "+"Marks-"+pn.getMarks());
		
	  }
   }
}