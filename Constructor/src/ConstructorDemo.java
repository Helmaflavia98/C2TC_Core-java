
	
public class ConstructorDemo {
	private String name;
	ConstructorDemo(){
		System.out.println("Constructor:");
		name="Helma";
		
	}
public static void main (String[] args)
{
	ConstructorDemo obj=new ConstructorDemo();
	System.out.println("The name is "+ obj.name);
		
}

}
