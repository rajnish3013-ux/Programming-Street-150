
import java.util.*;
public class evenOdd {

    public static void oddEven(int n){

        if(n%2==0){

            System.out.print("Even Number");
        }

        else{

            System.out.print("Odd Number");
        }

        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int n = sc.nextInt();

        oddEven(n);
    }
    
}
