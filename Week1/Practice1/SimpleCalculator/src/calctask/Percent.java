package calctask;

public class Percent implements Operation {
    private final Data operand;
    private final Data percent;

    public Percent(Data operand, Data percent) {
        this.operand = operand;
        this.percent = percent;
    }

    @Override
    public Data calc() {
        int value = (int)Math.round((double)operand.value()*percent.value()/100);
        return new DataItem(value, operand.dimension());
    }

    @Override
    public String toString() {
        return "#";
    }
}
