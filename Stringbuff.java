package xyz;

public class Stringbuff {

	public static void main(String[] args) {
StringBuffer s1=new StringBuffer("sai");
StringBuffer s2=new StringBuffer("praveen");
/*String s3="praveen";
String s4="pra";*/
System.out.println(s1.reverse());
System.out.println(s2.delete(2, 3));
System.out.println(s2.append(s1));
System.out.println(s2.insert(2, "a"));
System.out.println(s2.length());
/*System.out.println(s3==s4);
System.out.println(s3.equals(s4));*/

	}

}
