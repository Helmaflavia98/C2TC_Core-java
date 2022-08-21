public class StringDemo {
	public static void main(String []args)
	{
		int count=0;
		String str="Gayatri";
		char[]a=str.toCharArray();
		System.out.println("Repeated characters are:");
		for(int p=0;p<str.length();p++) {
			for(int q=p+1;q<str.length();q++){
				if(a[p]==a[q]) {
					System.out.println(a[q]);
					count++;
					break;
					
				}
			}
			
	}

	
}
}
