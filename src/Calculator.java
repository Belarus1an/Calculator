public class Calculator {

    public static void main (String[] args){

        CalcMethotd calcMethotd = new CalcMethotd();

        System.out.print("Wprowadź pierwszą liczbę ==> ");
        double num1 = calcMethotd.getNum();

        System.out.print("Wprowadź drugą liczbę ==> ");
        double num2 = calcMethotd.getNum();

        char operation = calcMethotd.getOperation();
        double result = calcMethotd.calc(num1, num2, operation);

        System.out.println("Wynik: " + num1 + " " + operation + " " + num2 + " = " + result);
    }
}