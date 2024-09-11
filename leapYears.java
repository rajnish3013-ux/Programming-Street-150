import java.util.*;
public class leapYears {

    public static void leapYear(int n){

        if(n%400==0){

            System.out.print("Leap Year");
            
        }

        else{

            System.out.print("Not Leap Year");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int n = sc.nextInt();

        leapYear(n);


    }
}

