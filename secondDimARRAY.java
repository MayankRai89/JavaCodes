
// import java.util.Scanner;
public class secondDimARRAY {
    // public static boolean search(int matrix[][], int key)
    // {
    //     for(int i=0; i<matrix.length; i++)
    //     {
    //         for(int j=0; j<matrix[0].length; j++)
    //         {
    //             if(matrix[i][j] == key)
    //             {
    //                 System.out.println("Found at cell ("+i+","+j+")");
    //                 return true;
    //             }
    //         }
    //     }
    //     System.out.println("Not found");
    //     return false;
    // }
    //   public static void main(String args[])
    //   {
    //     int matrix[][] = new int[3][3];
    //     int n =matrix.length, m= matrix[0].length;

    //     Scanner sc=new Scanner(System.in);
    //     for(int i = 0; i<n; i++)
    //     {
    //         for(int j = 0; j<m ; j++)
    //         {
    //             matrix[i][j] = sc.nextInt();
    //         }
    //     }
    //     for(int i =0; i<n ; i++)
    //     {
    //         for(int j=0; j<m; j++)
    //         {
    //             System.out.print(matrix[i][j]+ " ");
    //             // matrix[i][j] = sc.nextInt();
    //         }System.out.println();
    //     }
    //     search(matrix, 5);
    //   }


// spiral matrix
    // public static void main(String[] args) {
    //     int matrix[][] = {{1, 2, 3, 4},
    //                       {5, 6, 7, 8},
    //                       {9, 10, 11, 12},
    //                       {13, 14, 15, 16}
    //                      };
    //     // Spiralmatrix(matrix);
    //     System.out.println(diagonalsum(matrix)+" ");
    // }

    // public static void Spiralmatrix(int matrix[][]) {
    //     int startRow = 0;
    //     int startCol = 0;
    //     int endRow = matrix.length - 1;
    //     int endCol = matrix[0].length - 1;
    //     while (startRow <= endRow && startCol <= endCol) {
    //         // top
    //         for (int j = startCol; j <= endCol; j++) {
    //             System.out.println(matrix[startRow][j] + " ");
    //         }
    //         // right
    //         for (int i = startRow + 1; i <= endRow; i++) {
    //             System.out.println(matrix[i][endCol] + " ");
    //         }
    //         // bottom
    //         for (int j = endCol - 1; j >= startCol; j--) {
    //             if (startRow == endRow) {
    //                 break;
    //             }
    //             System.out.print(matrix[endRow][j] + " ");
    //         }
    //         // left
    //         for (int i = endRow - 1; i >= startRow + 1; i--) {
    //             if (startCol == endCol) {
    //                 break;
    //             }
    //             System.out.print(matrix[i][startCol] + " ");
    //         }
    //         startCol++;
    //         startRow++;
    //         endCol--;
    //         endRow--;
    //     }
    //     System.out.println();
    // }

    // // Sum of Diagonals of a  matrix
    // public static int diagonalsum(int matrix[][])
    // {
    //     int sum = 0;
    //     // for(int i = 0;i<matrix.length;i++)
    //     // {
    //     //     for(int j = 0;j<matrix[0].length;j++)
    //     //     {
    //     //         if(i == j)
    //     //         {
    //     //             sum += matrix[i][j];
    //     //         }
    //     //         else if(i+j == matrix.length-1)
    //     //         {
    //     //             sum +=matrix[i][j];
    //     //         }
    //     //     }
    //     // }
    //     for(int i = 0; i<matrix.length; i++)
    //     {
    //         sum+=matrix[i][i];
    //         if(i!=matrix.length-i-1)
    //         {
    //             sum += matrix[i][matrix.length-i-1];
    //         }
    //     }
    //     return sum;
    // }

// search in sorted
public static void main(String[] args) {
    int matrix[][] = {{11,12,13,14},
                      {15,16,17,18},
                      {19,20,21,22},
                      {23,24,25,26}};
    int key = 24;
    staircasesearch(matrix, key);
}
public static boolean staircasesearch(int matrix[][], int key)
{
    int row = 0, col = matrix[0].length - 1;
    while ( row < matrix.length && col >= 0) {
        if(matrix[row][col]== key)
        {
            System.out.println("Found key at ("+row+","+col+")");
            return true;
        }
        else if(key<matrix[row][col])
        {
            col--;
        }
        else{
            row++;
        }
    }System.out.println("key not found");
    return false;
}
}
