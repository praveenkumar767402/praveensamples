package xyz;

public class Stringdemo {

	public static void main(String[] args) {
		
		String s1=new String("praveen");
		String s2=new String("kumar");
		/*String s3="pra";
		String s4="pra";*/
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(2));
		System.out.println(s1.replace("pra","mav"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.startsWith("pr"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.equals(s2));
		/*System.out.println(s3==s4);
		System.out.println(s2.equals(s4));*/
	}
	

}
