
import java.util.*;
public class armstrongNumber{

    public static void numberArmstrong(int n){
        

        int t1 = n;
        int count = 0;
        while(t1!=0){

            t1 = t1/10;
            count++;
        }
         
        int t2 =n;
        int sum = 0;
        
        int rem;
        while(t2!=0){
            int arm = 1;
            rem = t2%10;

            
            for(int i=1; i<=count; i++){

                arm = arm*rem;
            }

            sum = sum+arm;
            t2 = t2/10;
        }

        if(sum==n){

            System.out.print("Armstrong Number");
        }

        else{

            System.out.print("Not armstrong Number");
        }
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();

        numberArmstrong(n);
    }
}


