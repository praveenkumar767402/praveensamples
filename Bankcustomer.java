package xyz;
class Bank
{

	int acno;
  String atype;
   int amt;
    Bank()
  { 
    	acno=123456789;
        atype="savings";
        amt=10000;
   }
    Bank(int a,String b,int c)
    {
    	acno=a;
    	atype=b;
    	amt=c;
    }

    void show()
    {
    	System.out.println(" a/c number :"+acno+"\n a/c type   :"+atype+"\n amount     :"+amt);
    }

}
public class Bankcustomer {

	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new Bank(987654321,"Salary",1000000000);
		System.out.println("Bankcustomer details of person 1");
		b1.show();
		System.out.println("Bankcustomer details of person 2");
		b2.show();
	}

}
