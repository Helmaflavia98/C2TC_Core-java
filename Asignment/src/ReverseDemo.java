
public class ReverseDemo {
	public static void main(String args[])
	{
		String str="Computer Science";
		char[] ch=str.toCharArray();
		System.out.print("Reverse of a string: ");
		int j=ch.length;
		for(int i=j;i>0;i--)
		{
			System.out.print(ch[i-1]);
		}
		
		}

}

