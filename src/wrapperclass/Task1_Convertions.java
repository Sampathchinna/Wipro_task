package wrapperclass;

public class Task1_Convertions {
	public static void main(String[] args) {
		int a=10;
		double b=2.35;
		char c='a';
		//convert to primitive to wrapper
		Integer a1=Integer.valueOf(a);
		System.out.println("Integer wrapper"+a1);
		Double b1=Double.valueOf(b);
		System.out.println("double wrapper"+1);
		Character  c1=Character.valueOf(c);
		System.out.println("character wrapper"+c1);
		System.out.println("...........................");
		//convert wrapper to primitive
		int aAgain = a1.intValue();
	    System.out.println("int primitive: " + aAgain);
	    double bAgain = b1.doubleValue();
	    System.out.println("double primitive: " + bAgain);
	    char cAgain = c1.charValue();
        System.out.println("char primitive: " + cAgain);	
	}

}
