package calctask;

public class Divide implements Operation {
    private final Data operand1;
    private final Data operand2;

    public Divide(Data operand1, Data operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Data calc() {
        int value = operand1.value() / operand2.value();
        StringBuilder sb = new StringBuilder();
        if (operand1.dimension().equalsIgnoreCase(operand2.dimension())) {
            sb.append("");
        } else {
            sb.append(operand1.dimension()).append(" / ").append(operand2.dimension());
        }
        return new DataItem(value, sb.toString());
    }

    @Override
    public String toString() {
        return "/";
    }
}
