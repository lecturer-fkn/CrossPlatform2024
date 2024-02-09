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
    }
}
