import java.util.*;
public class GCD_and_LCM {
    public static void main(String[] args) {
        System.out.println("Enter number1: ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter number2: ");
        int n2=sc.nextInt();
        int num1=n1;
        int num2=n2;
        while(n1%n2!=0)
        {
            int r=n1%n2;
            n1=n2;
            n2=r;
        }
        int gcd=n2;
        int lcm=(num1*num2)/gcd;
        System.out.println("The HCF is "+gcd);
        System.out.println("The LCM is "+lcm);

    }
}
