import java.util.*;
public class GRADING_SYSTEM {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks=s1.nextInt();
        if(marks>90){
            System.out.println("excellent");
        }
        else if(marks>80 && marks<90){
            System.out.println("Good");

        }
        else if(marks>70 && marks<80){
            System.out.println("fair");

        }
        else if(marks>60 && marks<70){
            System.out.println("meets expectation");

        }
        else
            System.out.println("below par");

    }
    
}
