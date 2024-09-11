import java.util.*;


public class addTwoNum {

    public static int addNum(int n, int m){

        int sum = n+m;

        System.out.print("Sum of two numbers is: ");

        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int  n = sc.nextInt();

        System.out.print("Enter srcond number: ");

        int m = sc.nextInt();

        System.out.print(addNum(n, m));
    }
    
}
