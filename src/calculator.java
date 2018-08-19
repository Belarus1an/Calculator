import java.util.Scanner;

public class calculator {

   private static Scanner scan = new Scanner(System.in);

    public static void main (String[] args){

        design();
        System.out.println("Hello! My name is Pavel. This is my first program 'Calculator'.");
        System.out.println("The program makes simple calculations with numbers.");
        design();

        System.out.println("Enter the number 1 ==> ");
        double num1 = getNum();

        System.out.println("Enter the number 2 ==> ");
        double num2 = getNum();

        System.out.println("Enter the operation (+, -, *, /) ==> ");
        char operation = getOperation();
        double result = calc(num1, num2, operation);

        design();
        System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
        design();
    }

    public static void design(){
        for (int i = 0; i <= 62; i++){
            System.out.print("=");
        }
        System.out.println(" ");
    }

    public static double getNum(){

        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        } else
        { System.out.println("Sorry, an error occurred while typing. Try again.");
            return getNum();
        }
    }

    public static char getOperation (){


        char operation;

        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
        } else
        { System.out.println("Sorry, an error occurred while typing. Try again.");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation){

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    break;
                } else
                    System.out.println("Sorry, you can not divide it by zero! Try again.");
            default:
                result = calc(getNum(), getNum(), getOperation());
        }
            return result;


    }


}