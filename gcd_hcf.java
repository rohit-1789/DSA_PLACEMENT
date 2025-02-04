public class gcd_hcf {

    void GCD (int number_1, int number_2) {

        int small = (number_1 < number_2) ? number_1 : number_2;

        for(int i=small; i>0; i--) {
            if (number_1 % i == 0 && number_2 % i == 0) {
                System.out.print(i+" ");
                break;
            }
        }

    }
    public static void main(String[] args) {
        gcd_hcf ob1 = new gcd_hcf();
        ob1.GCD(48, 18);
    }
}
