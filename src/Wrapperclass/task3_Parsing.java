package Wrapperclass;

public class task3_Parsing {
	static String intstr="123";
	static String doublestr="45.6";
	static String boolstr="true";
	public static void main(String[] args) {
		
		int intval=Integer.parseInt(intstr);
		double doubleval=Double.parseDouble(doublestr);
		boolean boolval=Boolean.parseBoolean(boolstr);
		
		System.out.println("parsing of integer: "+intval);
		System.out.println("parsing of double:"+doubleval);
		System.out.println("parsing of boolean: "+boolval);
	}

}
