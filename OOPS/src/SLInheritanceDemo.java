class Bicycle
{
	int gear;
	int speed;
	
	void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	void speedUp(int increment)
	{
		speed+=increment;
	}
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}

class MountianBike extends Bicycle
{
	int seatHeight;
	void adjustHeight(int value)
	{
		seatHeight=value;
	}
	
}
public class SLInheritanceDemo {
	public static void main (String[] args) 
	{
		Bicycle obj=new Bicycle();
		obj.gear=5;
		obj.speed=20;
		obj.speedUp(40);
		obj.applyBreak(5);
		System.out.println(obj.toString());
		
	}

}
