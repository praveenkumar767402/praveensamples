package xyz;

import java.util.Scanner;

public class Billdis {

	public static void main(String[] args) {
String pname;int n;//number of products
double nuts=10,cn=1000,co=500,cs=250,cd=500,oil=5,soaps=0.12;
System.out.println("enter your product");
Scanner sc=new Scanner(System.in);
pname=sc.next();
double total=0,dis,tdis;
switch(pname)
{
case "nuts":
	dis=cn*0.1;
	System.out.println("dis is 10%="+dis);
	System.out.println("enter number of quantities");
	Scanner nu=new Scanner(System.in);
	n=nu.nextInt();
	tdis=dis*n;
	System.out.println("total dis is="+tdis);
	total=cn*n-tdis;
	System.out.println("cost of nuts is="+total);
break;
case "oil":
	dis=co*0.05;
	System.out.println("dis is 5%="+dis);
	System.out.println("enter number of quantities");
	Scanner nu1=new Scanner(System.in);
	n=nu1.nextInt();
	tdis=dis*n;
	System.out.println("total dis is="+tdis);
	total=co*n-tdis;
	System.out.println("cost of oil is="+total);
break;
case "soaps":
	dis=cs*0.12;
	System.out.println("dis is 12%="+dis);
    System.out.println("enter number of quantities");
    Scanner nu2=new Scanner(System.in);
    n=nu2.nextInt();
    tdis=dis*n;
    System.out.println("total dis is="+tdis);
    total=cs*n-tdis;
    System.out.println("cost of soaps is="+total);
break;
default:
	System.out.println("dis is 2%");
	dis=cd*0.02;
	System.out.println("dis is 2%="+dis);
	System.out.println("enter your quantity");
	Scanner nu3=new Scanner(System.in);
	n=nu3.nextInt();
	tdis=dis*n;
	System.out.println("total dis is="+tdis);
	total=cd*n-tdis;
	System.out.println("total cost is="+total);
}
	}

}
