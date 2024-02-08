package calctask;

public class DataItem implements Data {
    private final int value;
    private final String dimension;

    public DataItem(int value, String dimension) {
        this.value = value;
        this.dimension = dimension;
    }

    @Override
    public int value() {
        return this.value;
    }

    @Override
    public String dimension() {
        return this.dimension;
    }

    @Override
    public String toString() {
        return this.value + " " + this.dimension;
    }

    public static void main(String[] args) {
        Data data = new DataItem(1, "kg");
        System.out.println(data);
    }
}
