public class ConstructorAndMethods {
    private int number;
    private double decimalNumber;
    private String text;

    public ConstructorAndMethods() {
        this.number = 11;
        this.decimalNumber = 11.10;
        this.text = "Hello there!";
    }

    public int getNumber() {
        return this.number;
    }

    public double getDecimalNumber() {
        return this.decimalNumber;
    }

    public String getText() {
        return this.text;
    }
}
