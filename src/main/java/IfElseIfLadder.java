public class IfElseIfLadder {
    public static void main(String[] args) {
        int number = 7;

        if (number > 10) {
            System.out.println("Number is greater than 10.");
        } else if (number > 5) {
            System.out.println("Number is greater than 5 but less than or equal to 10.");
        } else {
            System.out.println("Number is 5 or less.");
        }
    }
}
