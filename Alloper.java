package secondprogram;

public class Alloper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1,b=2,c;
String result;
c=a+b;
System.out.println("addition"+c);
System.out.println("ass="+(c+=a));
System.out.println("relational="+(a<b));
System.out.println("bitwise="+(c=a<<b));
System.out.println("unary="+(c=++b+a--));
System.out.println("logical");
System.out.println((a<=b)&&(b<=c));
result=(a>=b)?"a is big":"b is big";
System.out.println("ternary operator="+result);
	}

}
