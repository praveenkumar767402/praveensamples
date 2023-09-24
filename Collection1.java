package xyz;
import java.util.ArrayList;
class Employ
{
	long eid;
	String ename;
	int sal;
	public Employ(long eid, String ename, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employ [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
}
public class Collection1 {
	public static void main(String[] args) {
		Employ e1=new Employ(1,"prav",1234);
		Employ e2=new Employ(2,"pravee",12345);
		Employ e3=new Employ(3,"praveen",123456);
		ArrayList<Employ> al=new ArrayList<Employ>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		for (Employ e:al)
		{
			System.out.println(e.eid+" "+e.ename+"  "+e.sal);
		}
	}
}
