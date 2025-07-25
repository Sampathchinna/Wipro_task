package javaOopsTasks;

class Animal{
	
	void sound() {
		System.out.println("the animal is making sound");
	}
}
class Dog extends Animal{
	
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	
	@Override
	void sound() {
		//super.sound();
		System.out.println("cat Meows");
	}
}

class Cow extends Animal{
	
	@Override
	void sound() {
		System.out.println("cow moos");
	}
}
public class Task7_MethodOverriding {
	public static void main(String[] args) {
		Animal obj;
		obj=new Dog();
		obj.sound();
		
		obj=new Cat();
		obj.sound();
		
		obj=new Cow();
		obj.sound();
		
	}

}
