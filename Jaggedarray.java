package abc;

import java.util.Scanner;

public class Jaggedarray {

	public static void main(String[] args) {

		int[][] b=new int[4][];
       
       b[0]=new int[2];
       b[1]=new int[3];
       b[2]=new int[1];
       b[3]=new int [5];
       
       b[0][0]=1;
       b[0][1]=1;
       
       b[1][0]=1;
       b[1][1]=1;
       b[1][2]=1;
       
       b[2][0]=1;
       
       b[3][0]=1;
       b[3][1]=1;
       b[3][2]=1;
       b[3][3]=1;
       b[3][4]=1;

       System.out.println("jagged array");
for (int i=0;i<b.length;i++) 
{
	for(int j=0;j<b[i].length;j++)
	{
		System.out.print(b[i][j]);
	}
	System.out.println();
}
        }
	}


