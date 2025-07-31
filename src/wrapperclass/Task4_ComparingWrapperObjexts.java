package wrapperclass;

public class Task4_ComparingWrapperObjexts {
	static Integer x=100;
	@SuppressWarnings("removal")
	static Integer y=new Integer(100);
	
	public static void main(String[] args) {
		
		System.out.println("x==y:"+(x==y));//different memory allocations
		System.out.println("x.equals(y):"+x.equals(y));//Both contain value 100, and .equals() compares values
		
	}

}
