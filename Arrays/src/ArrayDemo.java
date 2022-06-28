
public class ArrayDemo {

	public static void main(String args[])
	{
	char name[] = new char[7]; //declaration and instantiation
	name[0] = 'g'; //initialization
	name[1] = 'a';
	name[2] = 'y';
	name[3] = 'a';
	name[4] = 't';
	name[5]='r';
	name[6]='i';
	for (int i = 0; i <=name.length-1; i++) //length is the property of array
	System.out.print(name[i]);
	
	}

}
