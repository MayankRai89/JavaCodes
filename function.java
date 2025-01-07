import java.util.Scanner;

public class function {
//     public static  void Helloworld(String args[])
//    {
//     System.out.println("Hello world");
//    }
//    public static void main(String args[]) {
//        Helloworld(args);// function call
//    }  




//  sum of two number using function
    //  public static void calculateSum(int a, int b)
    //  {
    //     int sum = a+b;
    //     System.out.println("Sum is : "+sum);
    //  }
    //  public static void main(String args[])
    //  {
    //     System.out.println("Enter the numbers you want the sum of: ");
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     calculateSum(a, b);
    //  }




// factorial of a number
    // public static int factorial(int n)
    // {
    //     int f = 1;
    //     for (int i=1; i<=n; i++)
    //     {
    //         f =  f * i;
    //     }
    //     return f;
    // }
    // public static void main(String args[])
    // {
    //     int fact;
    //     fact = factorial(5);
    //     System.out.println("factorial is : " + fact);
    // }




// binomial coefficient
    // public static int binCoeff(int n,int r)
    // {
    //     int fact_n= factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);
    //      int binCoeff = fact_n/(fact_r*fact_nmr);
    //      return binCoeff;
    // }
    // public static void main(String args[])
    // {
    //     System.out.println(binCoeff(5, 2));
    // }




// optimized prime
    // public static boolean isPrime(int n)
    // {
    //     if(n == 2)
    //     {
    //         return true;
    //     }
    //     for(int i =2; i<= Math.sqrt(n);i++)
    //     {
    //         if(n%i == 0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String arg[])
    // {
    //     System.out.println(isPrime(8));
    // }




//print all the prime numbers in the range
    // public static boolean isPrime(int n)
    // {
    //     if(n == 2)
    //     {
    //         return true;
    //     }
    //     for(int i =2; i<= Math.sqrt(n);i++)
    //     {
    //         if(n%i == 0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void primeInRange(int n)
    // {
    //     for(int i = 2;i<= n;i++)
    //     {
    //         if(isPrime(i))
    //         {
    //          System.out.print(i+" ");   
    //         }
    //     }
    // }
    // public static void main(String args[])
    // {
    //     primeInRange(20);
    // }



// convert binary to decimal
    // public static void binTodec(int binNum)
    // {
    // int mynum = binNum;
    //     int pow = 0;
    //     int decNum = 0;
    //     while (binNum > 0) {
    //         int lastDigit  = binNum % 10;
    //         decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
    //         pow++;
    //         binNum = binNum/10;
    //     }
    //     System.out.println("Decimal of "+ mynum +" = "+ decNum);
    // }  
    //     public static void main(String arg[])
    //     {
    //         binTodec(10101); 
    //     }



// number is even or not
    // public static boolean isEven(int n)
    // {
    //     if(n == 2)
    //     {
    //         return true;
    //     }
    //     else if(n % 2 == 0)
    //     {
    //         return true;
    //     }
    //     return false;
    // }
    //     public static void main(String[] args) {
    //     System.out.println( isEven(5));
    //     }




//  average of three numbers
    // public static int  Average(int a, int b, int c)
    // {
    //     int k = (a+b+c)/3;
    //     return k;
    // }
    // public static void main(String arg[])
    // {
    //     System.out.println(Average(1, 4, 6));
    // }




// if palindrome or not
    public static int Palindrome(int num) {
        int org = num;
        int rev = 0;
        while (org != 0) {
           int rem = org % 10;
            rev = rev * 10 + rem;
            org = org / 10;
        }
        return rev;
       
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check the palindrome of");
        int num = sc.nextInt();
        Palindrome(num);
        if(num == Palindrome(num))
        {
            System.out.println(Palindrome(num)+ " is palindrome number");
        }
        else{
            System.out.println("Not a Plaindrome number");
        }
    }



//  sum of a digits
    // public static int SumDigit(int num)
    // {
    //         int org = num;
    //         int rem,sum = 0;
    //         while(num != 0)
    //     {
    //          rem = num%10;
    //         sum = sum + rem;
    //          num = num/10;
    //     }
    //      return sum;
    // }
    //     public static void main(String[]  agrs)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the digit you want the sum of: ");
    //     int num = sc.nextInt();
    //    System.out.println("The sum of digits of "+num+" is " +SumDigit(num));     
    // }
}
