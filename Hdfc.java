//"Amar" is HDFC bank customer his Balance is 25000. He deposited 15000 amount himself.After  some time He trasfered 11000 amount to his friend "Surya".Print the current balance and find interest value on that amount with interest value 2%  and 12month

package secondprogram;

public class Hdfc {

	public static void main(String[] args) {
int bill=25000,depbill=15000,transforbill=11000,months=12,intrest,total;
total=(bill+depbill)-transforbill;
System.out.println("total bill without intrest="+total);
intrest=(total*2/100)*12;
System.out.println("intrest="+intrest);
total=total+intrest;
System.out.println("total="+total);
	}

}
