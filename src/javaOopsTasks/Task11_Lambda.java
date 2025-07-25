package javaOopsTasks;

@FunctionalInterface
interface MathOperation{
	int operate(int a,int b);
}
public class Task11_Lambda {
	public static void main(String[] args) {
		MathOperation add=(x,y) ->x+y;
		MathOperation multiply=(x,y) ->x*y;
		MathOperation subs=(x,y) ->x-y;
		MathOperation div=(x,y) ->x/y;
		
		System.out.println(add.operate(10,20));
		System.out.println(subs.operate(40,400));
		System.out.println(multiply.operate(30,40));
	}

}
