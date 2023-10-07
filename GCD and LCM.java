import java.util.*;
public class GCD_and_LCM {
    public static void main(String[] args) {
        System.out.println("Enter number1: ");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter number2: ");
        int n2=sc.nextInt();
        int min = (n1>n2)?n2:n1;
        int gcd = 0;
        for(int i = 1; i<=min; i++){
            if(n1%i==0 && n2%i ==0){
                gcd = i;
            }
        }
        System.out.println("GCD is: "+gcd);
        int lcm = 1;
        lcm =(n1*n2)/gcd;
        System.out.println("LCM is: "+lcm);
        
    }
}
