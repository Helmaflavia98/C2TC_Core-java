class ArrayObject
{
	@Override
	public String toString() {
		return "ArrayObject [roll_no=" + roll_no + ", name=" + name + "]";
	}

	public ArrayObject(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
	public int roll_no;
	public String name;
}

public class Siet {
	public static void main(String[] args)
	{
		ArrayObject[] arr=new ArrayObject[5];
		arr[0]= new ArrayObject(101, "Chandana");
		arr[1]= new ArrayObject(101, "Netra");
		arr[2]= new ArrayObject(101, "Yasmin");
		arr[3]= new ArrayObject(101, "Helma");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
	}
}


