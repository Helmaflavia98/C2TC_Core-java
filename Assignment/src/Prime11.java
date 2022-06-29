
import java.util.Scanner;
public class Prime11 {
	public static void main(String[] args)
	{
	int n,i,count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number:");
	n = sc.nextInt();
	for(i = 2; i < n ; i++)
	{
	if(n%i == 0)
	{
	count++;
	break;
	}
	}
	if(count == 0)
	System.out.println("Prime Number");
	else
	System.out.println("Not a Prime Number");

	}
	}


