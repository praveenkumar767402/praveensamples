package xyz;

public class Stringbil {

	public static void main(String[] args) {
StringBuilder s1=new StringBuilder("praveen");
StringBuilder s2=new StringBuilder("praveen");
/*String s3="praveen";
String s4="pra";*/
System.out.println(s1.reverse());
System.out.println(s2.delete(2, 3));
System.out.println(s2.append(s1));
System.out.println(s2.insert(2, "a"));
System.out.println(s2.length());
/*System.out.println(s1==s1);
System.out.println(s1.equals(s3));*/
	}

}
