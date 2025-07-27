package exceptionHandling;

final class Constants {
    public static final String COUNTRY = "India";
}

// This will cause a compile-time error:
// class MyClass extends Constants { }

public class Task3_FinalClass {
    public static void main(String[] args) {
        System.out.println("Country: " + Constants.COUNTRY);
    }
}

