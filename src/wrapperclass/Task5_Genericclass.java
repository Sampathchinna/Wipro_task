package wrapperclass;

class Box<T>{
	private T value;
	
	//method to store a value
	public void set(T value) {
		this.value=value;
	}
	//method to retrieve
	public T get() {
		return value;
	}
}

public class Task5_Genericclass {
	public static void main(String[] args) {
		Box<Integer> intBox=new Box<Integer>();
		intBox.set(129);
		int s=intBox.get();
		System.out.println("integer value:"+s);
		
		Box<Double> doubleBox=new Box<Double>();
		doubleBox.set(123.5);
		System.out.println("double value:"+doubleBox.get());
		
	}

}
