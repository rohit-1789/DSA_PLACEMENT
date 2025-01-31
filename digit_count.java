import java.lang.Math;

public class digit_count {

    int digit_count_method_1(int number) {
        int temp = number;
        int digi_cnt = 0;
        while(temp > 0) {
            int rem = temp%10;
            digi_cnt+=1;
            temp/=10;
        }

        return digi_cnt;
    }

    int digit_count_method_2(int number) {
        double temp = number;
        double digi_cnt = Math.log10(temp) + 1;
        return (int)digi_cnt;

    }

    public static void main(String[] args) {

        digit_count dg1 = new digit_count();
        //System.out.println(dg1.digit_count_method_1(17789));
        System.out.println(dg1.digit_count_method_2(175));

    }    
}
