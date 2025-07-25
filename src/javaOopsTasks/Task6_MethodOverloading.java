package javaOopsTasks;

class Calculater{
	
	int add(int x, int y) {
		int res;
		res=x+y;
		
	return res;
	}
	double add(double x,double y) {
		double res;
		res=x+y;
	return res;
			
	}
	String add(String x, String y) {
		String res;
		res=x+y;
		System.out.println("sum is: "+res);
	return res;
	}
}

public class Task6_MethodOverloading {
	
	public static void main(String[] args) {
		Calculater obj=new Calculater();
		System.out.println(obj.add(2.5,3.8));
		obj.add("sam","ram");
	}
	

}
