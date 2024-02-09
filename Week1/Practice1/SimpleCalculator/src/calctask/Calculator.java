package calctask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Data x = new DataItem(1,"kg");
        Data y = new DataItem(2, "kg");
        List<Operation> op = new ArrayList<>();
        op.add(new Plus(x, y));
        op.add(new Minus(x, y));
        op.add(new Times(x, y));
        op.add(new Divide(y, x));

        for (Operation o : op) {
            System.out.println(x + " " + o + " " + y + " = " + o.calc());
        }

        x = new DataItem(500, "$");
        y = new DataItem(25, "%");
        Operation o = new Percent(x, y);
        System.out.println(x + " " + o + " " + y + " = " + o.calc());
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second operand: ");
        int secondNumber = sc.nextInt();

        System.out.print("Input the type of operation (+, -, *, /, %, #): ");
        String operation = sc.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println(firstNumber + " " + operation + " " + secondNumber + " = " + result);
        */
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
