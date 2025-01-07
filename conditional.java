
import java.util.*;



public class conditional 
{

    public static void main(String args[])
    {
        //         int age = 16;
        //                 if(age>=18)
        //         {
        //             System.out.println("adult : drive, vote");
        //         }
        //         if(age>13 && age<18) 
        //         {
        //             System.out.println("teenager");
        //         }
        //         else{
        //             System.out.println("no adult");
        //         }
        //     }

        // {
        //     int i = 1;
        //     int j = 9;
        //     if(i>= j)
        //     {
        //         System.out.println("i is largest of two");
        //     }else{
        //         System.out.println("j is largest of two");
        //     }
        // }
        // { 
        //     Scanner sc = new Scanner(System.in);
        //     int number = sc.nextInt();
        //     if (number % 2 == 0) {
        //         System.out.println("Even");
        //     } else {
        //         System.out.println("Odd");
        //     }
        // }
        // {
        //     Scanner sc = new Scanner(System.in);
        //     int income = sc.nextInt();
        //     int tax;
        //     if(income < 500000){
        //         tax= 0;
        //     }
        //     else if(income>= 500000 && income<1000000)
        //     {
        //         tax = (int)(income*0.2);
        //     }
        //     else{
        //         tax = (int)(income*0.3);
        //     }System.out.println("your tax is: "+tax);
        // }

        // {
        //     int A = 3;
        //     int B = 5;
        //     int C = 8;
        //     if(A>B && A>C)
        //     {
        //         System.out.println("A is Greatest of three");
        //     }
        //    else if(B>A && B>C)
        //     {
        //         System.out.println("B is Greatest of three");
        //     }
        //     else{
        //         System.out.println("C is Greatest of three");
        //     }
        // }
        
        // {
        //     int number = 4;
        //     // ternary operator
        //     String type = ((number %2)==0)? "even":"odd";
        //     System.out.println(type);
        // }

        // switch case statement
        // {
        //     int number =2;
        //     switch(number)
        //     {
        //         case 1: System.out.println("Samosa");
        //         break;
        //         case 2: System.out.println("Burger");
        //         break;
        //         case 3: System.out.println("AAlo banda");
        //         break;
        //         default : System.out.println("We wake up");
        //     }
        // }
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enetr value of a : ");
        // int a = sc.nextInt();
        // System.out.println("Enetr value of b : ");
        // int b = sc.nextInt();
        // System.out.println("Enter operator : ");
        // char operator = sc.next().charAt(0);
        // switch (operator) {
        //     case '+': System.out.println(a+b);
        //         break;
        //     case '-': System.out.println(a-b);
        //         break;
        //     case '*': System.out.println(a*b);
        //         break;
        //     case '/': System.out.println(a/b);
        //         break;
        //     case '%': System.out.println(a%b);
        //         break;
        
        //     default: System.out.println("Wrong Operator");
        //         break;
        // }

        
            Scanner sc = new Scanner(System.in);
            /* Input week number from user */
            System.out.println("Enter week number(1-7): ");
            int week = sc.nextInt();
            switch(week) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid input! Please enter week number between1-7.");
            }
        
            
        
    }
}
