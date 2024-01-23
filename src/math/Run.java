package math;

import java.util.Scanner;

public class Run {
    public void executeAllMathOperation() {
        // get user input
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("enter first number");
        String firstNumberStr  = scanner.nextLine();

        System.out.println("enter second number");
        String secondNumberStr   = scanner.nextLine();

        float firstNumber;
        float secondNumber;

        try {
            firstNumber = Float.parseFloat(firstNumberStr);
            secondNumber = Float.parseFloat(secondNumberStr);
        } catch (NumberFormatException e) {
            // If parsing as float fails, try parsing as integers
            try {
                int intFirst = Integer.parseInt(firstNumberStr);
                int intSecond = Integer.parseInt(secondNumberStr);
                firstNumber = (float) intFirst;
                secondNumber = (float) intSecond;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter valid numbers.");
                return;
            }
        }

        float sum = Calculator.sum((firstNumber) , (secondNumber) );
        float subtract = Calculator.subtract((firstNumber) , (secondNumber));
        float multiply = Calculator.multiply((firstNumber) , (secondNumber));
        float divide = Calculator.divide((firstNumber) , (secondNumber));


        printMathResults(sum, subtract, multiply, divide);
    }

    private <T> void printMathResults(T sum, T subtract, T multiply, T divide) {
        String toPrint = String.format("sum is: %s, subtract is %s, multiply is %s and divide is %s", sum, subtract, multiply, divide);
        System.out.println(toPrint);
    }
}
