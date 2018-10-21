import java.util.Scanner;

public class CalcMethotd {

    private static Scanner scan = new Scanner(System.in);

    public static double getNum(){

        if (!scan.hasNextDouble()) {
            System.out.println("Błąd! Spróbuj ponownie");
            scan.next();
            return getNum();
        } else {
            return scan.nextDouble();
        }
    }

    public static char getOperation (){
        System.out.println("Wprowadź operację( + , - , * , / )");
        char operation;
        operation = scan.next().charAt(0);
        switch (operation){
            case '+': return operation;

            case '-': return operation;

            case '*': return operation;

            case '/': return operation;

            default:
                System.out.println("Błąd! Spróbuj ponownie");
                return getOperation();
        }
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
                    System.out.println("Dzielenie na 0!");
                    System.exit(0);
            default:
                result = calc(getNum(), getNum(), getOperation());
        }
        return result;
    }
}
