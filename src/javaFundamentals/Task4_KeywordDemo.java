package javaFundamentals;

public class Task4_KeywordDemo {
	
	static final int value = 10;          // static, final, integer
    private String name = "sampath";       // private, String

    public static void main(String[] args) { // public, static, void,String
        boolean status = true;            // boolean
        char grade = 'B';                 // char
        double score = 85.5;              // double

        if (status) {                     // if
            System.out.println("Name: sampath");
        } else {                          // else
            System.out.println("Status is false");
        }

        switch (grade) {                  // switch
            case 'A':
                System.out.println("Excellent");
                break;                   // break
            case 'B':
            	System.out.println("Better");
            	break;
            default:
                System.out.println("Good effort");
        }

        System.out.println("Score: " + score);
    }
}