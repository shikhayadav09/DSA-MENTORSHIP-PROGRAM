import java.util.*;
public class count_digits_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int lastDigit = n%10;
            count += 1;
            n/=10;
        }
        System.out.println("number digits in n :" + count);
    }
}
