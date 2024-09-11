
// import java.util.*;
// public class armstrongNumber {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n;
//         int count=0;
//         System.out.print("Enter a Number: ");
//         n = sc.nextInt();
        
//         int tem1 = n;
//         while(tem1!=0){

//             tem1 = tem1/10;
//             count++;
//         }
        
        
//         int rem;
        
//         int arm = 0;
//         int tem2 = n;
//         while(tem2!=0){
//             int mul=1;
//             rem = tem2%10;
            
            
//             for(int i=1; i<=count; i++){

//                 mul = mul*rem;
                

//             }

//             arm = mul+arm;
//             tem2 = tem2/10;
           
//         }

//         if(arm==n){

//             System.out.print("Armstrong Number");
//         }

//         else{

//             System.out.print("Not Armstrong Number");
//         }
          
        
//     }
    
// }


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


