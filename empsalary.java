package secondprogram;

import java.util.Scanner;

public class empsalary {

	public static void main(String[] args) {
double salary,gross,da,hra,pf;
double daratio=0.12,hraratio=0.13,pfratio=0.15;
System.out.println("enter salary");
Scanner sc=new Scanner(System.in);
salary=sc.nextInt();
da=daratio*salary;
hra=hraratio*salary;
pf=pfratio*salary;
gross=salary+da+hra+pf;
System.out.println("gross="+gross);
	}

}
