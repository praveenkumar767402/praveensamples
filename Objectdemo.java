package xyz;

public class Objectdemo {

	public static void main(String[] args) {
		int x=10;
		StringBuilder s1=new StringBuilder("kumar");
		StringBuilder s2=new StringBuilder("praveen");
		/*String s3="praveen";
		String s4="praveen";*/
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.hashCode());
		System.out.println(s1.toString());
		System.out.println(s1.getClass());
	}

}
