public class AllDivisorInt {

    void printAllDivisors(int number) {
        for (int i = 1; i*i <= number; i++) { // Start from 1
            if (number % i == 0) { // If `i` is a divisor
                
                System.out.println(i); // Print first divisor

                // Print the second divisor only if it's different
                if (i != number / i) {
                    System.out.println(number / i);
                }
            }
        }
    }

    public static void main(String[] args) {
        AllDivisorInt object = new AllDivisorInt();
        System.out.println("Divisors of 36:");
        object.printAllDivisors(36);
    }
}
