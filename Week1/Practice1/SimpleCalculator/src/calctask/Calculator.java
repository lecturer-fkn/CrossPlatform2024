package calctask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second operand: ");
        int secondNumber = sc.nextInt();

        System.out.print("Input the type of operation (+, -, *, /, %, #): ");
        String operation = sc.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
    }

    private static int percent(int value, int per) {
        return (int)Math.round((double)value*per/100);
    }

    public static int performOperation(int firstOperand, int secondOperand, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "%":
                result = firstOperand % secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
            case "#":
                result = percent(firstOperand, secondOperand);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}
