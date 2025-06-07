
import java.util.Scanner;




public class loopflow {
//     public static void main(String args[]){
//     int counter = 0;
//     while(counter < 10)
//     {
//         System.out.println("Hello");
//         counter++;
//     } 
//     System.out.println("Printed hello 10x");

//    public  static void main(String args[]) {
//         int counter = 1;
//         while (counter<=10) {
//             System.out.print(counter+" ");
//             counter++;
//         }
//         System.out.println();
//     }
    // public static void main(String args[]) {
    //     System.out.print("Enter the valu upto which you want to print the number\n");
    //     Scanner sc = new Scanner(System.in);
    //     int range = sc.nextInt();
    //      int counter = 1;
    //     while (counter <= range) {
    //         System.out.print(counter + " ");
    //         counter++;
    //     }
    //     System.out.println();
    // }
    // public static void main(String args[])
    // {
    //     System.out.print("Enter the value of n upto which you want the sum of\n");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt(); 
    //     int sum = 0;
    //     int i = 1;
    //     while(i<=n)
    //     {
    //         sum = sum + i;
    //         i++;
    //     }
    //     System.out.print("The sum of first "+n+" digit is "+sum);
    // }
    // Square pattern using for loop
    // public static void main(String args[])
    // {
    //     for(int i = 0;i<=4;i++)
    //     {
    //         for(int j = 0; j<= 4; j++)
    //         {
    //             System.out.print(" * ");
    //         }
    //         System.err.println();
    //     }
    // }
    // PRINT REVERSE OF A NUMBER
    // public static void main(String[] args) {
    //     System.out.print("Enter the number you want to reverse:\n");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int rev = 0;
    //     while (n!= 0) {
    //           rev = n%10; 
    //           System.out.print( rev);
    //           n = n/10;
    //     }
    // }
    // DO WHILE LOOP
    // public static void main(String[] args) {
    //     int counter = 1;
    //     do{
    //         System.out.println("Helo world");
    //         counter ++;
    //     }
    //     while(counter<10);
    // }
    // BREAK STATEMENT
    // public static void main(String[] args) {
    //     for (int i = 0; i < 10; i++) {
    //         if (i == 3) {

    //             break;
    //         }
    //         System.out.println(i);
    //     }
    // }

    // QUESTION USING BREAK STATEMENT
    // public static void main(String args[])
    // {
    //      Scanner sc = new Scanner(System.in);
        
    //      do{
    //         System.out.println("Enter your number: ");
    //         int n = sc.nextInt();
    //         if(n%10 == 0)
    //         {
    //             break;
    //         }
    //         System.out.print(n);
            
    //      }
    //      while(true);
    // }


    // CONTINUE STATEMENT
    // public static void main(String[] args) {
    //     for(int i = 1; i<= 5;i++)
    //     {
    //         if (i == 3)
    //         {
    //             continue;
    //         }
    //         System.out.println(i);
    //     }
    // }


    // PRIME OR NOT
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<=n-1; i++)
        {
            if(n%i == 0)
            {
                isPrime = false;
            }
        }
        if(isPrime == true)
        {
            System.out.println("is Prime");
        }
         else
        {
            System.out.println("not Prime");
        }
    }

}
