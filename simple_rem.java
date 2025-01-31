public class simple_rem {

    public static void main(String[] args) {
        
        int number = 17789;

        while(number > 0) {
            int rem = number%10;
            System.out.println("Rem "+rem);
            number/=10;
        }

    }
}