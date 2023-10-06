package abc;

import java.util.Scanner;

public class Allarraysdemo {

	public static void main(String[] args) {
int[] a=new int[3];
double[] b=new double[3];
String[] c=new String[3];
Scanner sc=new Scanner(System.in);
System.out.println("enter integer array");
for (int i=0;i<=2;i++)
{
	a[i]=sc.nextInt();
	}
System.out.println("enter double array");
	for(int  i=0;i<=2;i++) 
	{
	b[i]=sc.nextDouble();
	}
	System.out.println("enter string array");
	for(int  i=0;i<=2;i++) 
	{
    c[i]=sc.next();
    }
	for (int i=0;i<=2;i++) {
		System.out.println(a[i]+"  "+b[i]+"  "+c[i]);
	}
	System.out.println();
	}

}

