import java.util.*;
public class check_prime {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            boolean isPrime = true ;
            if (i == 1)
                continue;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime == true) {
                System.out.print(i + " ");
            }
        }
    }

}
