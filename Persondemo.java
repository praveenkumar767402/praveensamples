package abc;
class Person
{
	int pid;
	String pname;
	Person()
	{
		pid=1;
		pname="praveen kumar";
	}
}
class Student extends Person
{
int marks;	
Student()
{
  marks=100;
}
void show()
{
	System.out.println("Student details");
  System.out.println(" peson id     :"+pid+"\n person name  :"+pname+"\n marks        :"+marks);
}
}
class Emp extends Person
{
int salary;
Emp()
{
salary=100000;
}
void show()
{
	System.out.println();
	System.out.println("Employ details");
	System.out.print(" person id    :"+pid+"\n person name  :"+pname+"\n person salary:"+salary+" ");
}
}
public class Persondemo {

	public static void main(String[] args) {
		Student s=new Student();
		Emp e=new Emp();
		s.show();
		e.show();
	}

}
