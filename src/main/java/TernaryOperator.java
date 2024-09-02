public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int min = (a < b) ? a :
                (a > b) ? b :
                        null;

        System.out.println("The minimum value is: " + min);

    }
}
