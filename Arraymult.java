package abc;

import java.util.Scanner;

public class Arraymult {

	public static void main(String[] args) {
int[][] a=new int[2][2];
int[][] b=new int[2][2];
int[][] c=new int[2][2];
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st array elements");
for (int i=0;i<=1;i++) {
	for (int j=0;j<=1;j++)
	{
a[i][j]=sc.nextInt();
}}
System.out.println("enter 2nd array elements");
for (int i=0;i<=1;i++)
	for (int j=0;j<=1;j++)
	{

b[i][j]=sc.nextInt();

	}
for(int i=0;i<=1;i++) {
	for(int j=0;j<=1;j++) {
		c[i][j]=0;
		for(int k=0;k<=i&&k<=j;k++) 
	//c[i][j]=0;	
	{


c[i][j]=a[i][k]*b[k][j]+a[i][k]*b[k][j];

}
//System.out.println(c[i][j]);
	}
}
System.out.println("multiplication of two arrays is");
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
		System.out.print(" "+c[i][j]);
			}
	
	System.out.println();
	}
}
	
}
