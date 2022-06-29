class Animal{
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog extends Animal {
	public void display() {
		System.out.println("My name is " +name);
	}
}
public class JavaInheritance {
	public static void main(String[] args) {
		Dog Lab=new Dog();
		Lab.name="Rohu";
		Lab.display();
		Lab.eat();
	}
}

		


