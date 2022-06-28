class Data{
	private String name;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class AccessmodifiersDemo {
	public static void main(String[] args)
	{
		Data d=new Data();
		d.setName("Helma");
		System.out.println(d.getName());
	}
	

}
