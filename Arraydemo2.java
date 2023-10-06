package abc;

public class Arraydemo2 {

	public static void main(String[] args) {
int even_count=0,odd_count=0;
int a[]= {1,2,3,4,5,6,7,8,9,10};
for (int i=0;i<=9;i++) {
	if(a[i]%2==0)
	{
		System.out.println(a[i]+"even number");
		even_count+=1;
	}
	else
	{
		System.out.println(a[i]+"odd number");
		odd_count+=1;	
	}
	}
System.out.println();
System.out.println("total even numbers="+even_count);
System.out.println("total odd numbers="+odd_count);
	}
}
