package xyz;
class Student
{
	int sid;
	String sname;
	int marks;
	void input(int x,String y,int z)
	{
		sid=x;
		sname=y;
		marks=z;
	}
	void output()
	{
		System.out.println("Student details");
		System.out.println(" student id   :"+sid+"\n student name :"+sname+"\n student marks:"+marks);
	}
	} 
public class Studentdemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.input(1,"praveen kumar",1000);
		s1.output();
	}

}
