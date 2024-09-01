public class Main {
    public static void main(String[] args) {
        ConstructorAndMethods theClass = new ConstructorAndMethods();

        // Data in Object
        System.out.println("The number: "+theClass.getNumber());
        System.out.println("The decimal number: "+theClass.getDecimalNumber());
        System.out.println("The text: "+theClass.getText());

        // Unary Operators
        int theNumber = theClass.getNumber();
        System.out.println("Original number: " + theNumber);
        System.out.println("Post-increment: " + (theNumber++));
        System.out.println("After Post-increment: " + theNumber);
        System.out.println("Pre-decrement: " + (--theNumber));
        System.out.println("Negation: " + (-theNumber));

        // Arithmetic Operators
        double theDecimal = theClass.getDecimalNumber();
        System.out.println("Addition: " + (theNumber + theDecimal));
        System.out.println("Subtraction: " + (theNumber - theDecimal));
        System.out.println("Multiplication: " + (theNumber * theDecimal));
        System.out.println("Division: " + (theNumber / theDecimal));
        System.out.println("Modulus: " + (theNumber % theDecimal));

        // Relational Operators
        System.out.println("The Number is greater than the Decimal? " + (theNumber > theDecimal));
        System.out.println("The Number is smaller than the Decimal? " + (theNumber < theDecimal));
        System.out.println("The Number is equal to the Decimal? " + (theNumber == theDecimal));
        System.out.println("The Number is not equal to the Decimal? " + (theNumber != theDecimal));
        System.out.println("The Number is greater than or equal to the Decimal? " + (theNumber >= theDecimal));
        System.out.println("The Number is smaller or equal to the Decimal? " + (theNumber <= theDecimal));
    }
}
