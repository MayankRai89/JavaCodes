
public class patternprint {

    public static void main(String[] args) {
        // for(int i = 1;i<=4;i++)
        // {
        //     for(int j =1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        

// reverse pattern print
        // for(int i = 1;i<=4;i++)
        // {
        //     for(int j = 1;j<= 4-i+1;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



// half pyramid (print number)
        // for(int i = 1;i<=4;i++)
        // {
        //     for(int j = 1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }System.out.println();
        // }



// half pyramid(Print Character)
        // char ch = 'A';
        // for(int i = 1;i<=4;i++)
        // {
        //     for(int j =1;j<=i;j++)
        //     {
        //         System.err.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }



//  hollow rectangle
    //     hollowrectangle(10, 10);

    // }

    // public static void hollowrectangle(int totrows, int totcols) {
    //     for (int i = 1; i <= totrows; i++) {
    //         for (int j = 1; j <= totcols; j++) {
    //             if (i == 1 || i == totrows || j == 1 || j == totcols) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.err.println();
    //     }



// Inverted Rotated half pyramid

    //     Inverted_rotated_half_pyramid(5);
    
    // }
    // public static void Inverted_rotated_half_pyramid(int n) {
    //     for(int i = 1;i<=n;i++)
    //     {
    //         //  spaces
    //         for(int j = 1; j<= n-i;j++)
    //         {
    //         System.out.print(" ");
    //         }

    //         //  stars
    //         for(int j = 1;j<=i;j++)
    //         {
    //         System.out.print("*");
    //         }

    //         System.err.println();
    //     }

    

// floyd's triangle
    // floyd_triangle(4);
    
    // }
    //     public static void floyd_triangle(int n)
    //     {
    //         int counter = 1;
    //         for(int i = 1;i<=n;i++)
    //         {
    //             for(int j = 1;j<=i;j++)
    //             {
    //                 System.out.print(counter+"  ");
    //                 counter++;
    //             }
    //             System.out.println();
    //         }
    //     }



// (0-1)triangle
// zero_one_triangle(5);
//     }
//     public static void zero_one_triangle(int n) 
//     {
//         for(int i = 1;i<=n;i++)
//         {
//             for(int j = 1;j<=i;j++)
//             {
//                 if((i+j)%2 == 0)
//                 {
//                     System.out.print("1");
//                 }
//                 else
//                 {
//                     System.out.print("0");
//                 }   
//             } 
//         System.out.println();
//         }
//     }


// Butterfly pattern
//     Butterfly(7);
// }
//     public static void Butterfly(int n)
//     {
//         // 1st half
//              for(int i = 1;i<=n;i++)
//         {
//             // stars 
//             for(int j = 1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }

//             // spaces - 2*(n-i)
//             for(int j = 1;j<=2*(n-i);j++)
//             {
//                 System.out.print(" ");
//             }

//             // stars - i
//             for(int j = 1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//                 System.out.println();
//         }
//             // 2nd half
//             for(int i= n;i>=1;i--)
//         {
//             // stars 
//             for(int j = 1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
 
//             // spaces - 2*(n-i)
//             for(int j = 1;j<=2*(n-i);j++)
//             {
//                 System.out.print(" ");
//             }
 
//             // stars - i
//             for(int j = 1;j<=i;j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }


//  Diamond pattern
    Diamond(5);
    }
    public static void Diamond(int n)
    {
    // 1st half
         for(int i=1; i<=n; i++)
        {// spaces
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
        // 2nd half
        for(int i=n;i>=1;i--)
        {// spaces
            for(int j = 1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
    
             for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}

