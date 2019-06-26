
import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
//        int num = sc.nextInt();
        int num = 5;
        int factorial = fact(num);
        System.out.println("Factorial of number is : "+ factorial);
    }
    static int fact(int n){
        int output;
        if(n==1){
            return 1;
        }
        System.out.println("fact(" + (n-1) +" )  * "+n);
        output = fact(n-1)*n;
        return output;
    }
}
