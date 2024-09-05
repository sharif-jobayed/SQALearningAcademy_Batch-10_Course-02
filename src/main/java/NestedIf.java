public class NestedIf {
    public static void main(String[] args) {
        int number = 8;

        if (number > 5) {
            if (number < 10) {
                System.out.println("Number is greater than 5 but less than 10.");
            } else {
                System.out.println("Number is 10 or more.");
            }
        } else {
            System.out.println("Number is 5 or less.");
        }
    }
}
