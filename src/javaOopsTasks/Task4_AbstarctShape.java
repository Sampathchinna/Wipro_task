package javaOopsTasks;

abstract class shape{
	abstract double area();
}

class Circle extends shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}

    @Override
    double area() {
    	double pi=3.14;
        return pi * radius * radius;
    }
}
class rectangle extends shape{
	double length,width;
	
	rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	@Override
	double area() {
		return length*width;
	}
}

public class Task4_AbstarctShape {
	
	public static void main(String[] args) {
		shape obj=new Circle(5);
		System.out.println(obj.area());
		shape obj1=new rectangle(12,34);
		System.out.println(obj1.area());
		
	}

}
