public class ExampleObject {
    int number;

    ExampleObject(int number) {
        this.number = number;
    }

    void displayNumber() {
        System.out.println("The number is: " + this.number);
    }
}

class Main {
    public static void main(String[] args) {
        ExampleObject obj = new ExampleObject(25);

        obj.displayNumber();
    }
}
