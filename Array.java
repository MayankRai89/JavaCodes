
public class Array {
    // public static void main(String[] args) {
    //     int marks[] = new int[169];
    //     // Scanner sc = new Scanner(System.in);
    //     // marks[0] = sc.nextInt();
    //     // marks[1] = sc.nextInt();
    //     // marks[2] = sc.nextInt();
    //     // System.out.println("Phy : "+ marks[0]);
    //     // System.out.println("Chem : "+ marks[1]);
    //     // System.out.println("Math : "+ marks[2]);
    //     // int percentage = (marks[0] + marks[1]+ marks[2])/3;
    //     // System.out.println("Percentage = "+percentage+ " %");
    //     System.out.println("length of array = "+ marks.length);
    // }


//  call by reference
    // public static void update(int marks[]) {
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    // public static void main(String[] args) {
    //     int marks[] = {97, 98, 99};
    //     update(marks);
    //     for (int i = 0; i < marks.length; i++) {
    //         System.out.print(marks[i] + " ");
    //     }
    //     System.out.println();
    // }

// linear search  
    // public static void main(String[] args) {
    //     int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    //     int key = 8;
    //     int index = linear_search(number, key);
    //     if(index == -1)
    //     {
    //         System.out.println("NOT FOUND");
    //     }
    //     else{
    //         System.out.println("Key is at index : "+index); 
    //     }
    // }
    // public static int linear_search(int number[],int key)
    // {
    //     for(int i = 0; i< number.length;i++)
    //     {
    //         if(number[i] == key)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


// largest in array
//     public static int getlargest(int numbers[])
//     {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0; i<numbers.length; i++)
//         {
//             if(largest<numbers[i])
//             {
//                 largest = numbers[i];
//             }
//             if(smallest>numbers[i])
//             {
//                 smallest = numbers[i];
//             }
//         }
//         System.out.println("Smallest value is: "+smallest);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {1,23,4,56,78,91,2};
// System.out.println("Largest value is : "+getlargest(numbers));
//     }


// Binary search
// public static int binary_search(int number[], int key)
// {
//     int mid;
//     int low = 0;
//     int high = number.length-1;
//     while(low<=high)
//     {
//         mid = (low+high)/2;
//         if(number[mid]<key)
//         {
//             low = mid +1;
//         }
//         if(number[mid] == key)
//         {
//             return mid;
//         }
//         if(number[mid] > key)
//         {
//             high = mid-1;
//         }
//     }
//     return -1;
// }
// public static void  main(String args[])
// {
//     int number[] = {1,2,3,4,5,6,7,8,9};
//     int key = 7;
//     binary_search(number,key);
//     System.out.println("Index of key is: " + binary_search(number, key));
// }


// reverse an array
// public static void main(String[] args) {
//    int number[] = {1,2,3,4,5};
//    for(int i = 0;i<number.length;i++)
//    {
//     System.out.print(number[i]+" ");
//    }
//    reverse(number);
//    System.out.println();
//    for(int i = 0;i<number.length;i++)
//    {
//     System.out.print(number[i]+" ");
//    }
//    System.out.println();
// }
// public static void reverse(int number[]){
//     int first = 0, last = number.length-1;
//     while(first<last)
//     {
//         int temp  = number[last];
//         number[last] = number[first];
//         number[first] = temp;
//         first++;
//         last--;
//     }
// }

//  pairs of an array
    // public static void printrpairs(int number[]) {
    //     int tp = 0;
    //     for (int i = 0; i < number.length; i++) {
    //         int curr = number[i];
    //         for (int j = i + 1; j < number.length; j++) {
    //             System.out.print("(" + curr + "," + number[j] + ") ");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total pairs = " + tp);
    // }
    // public static void main(String[] args) {
    //     int number[] = {1, 2, 3, 4, 5};
    //     printrpairs(number);
    // }
//  subarrays
    // public static void printSubarray(int numbers[]) {
    //     int ts = 0;
    //     for (int i = 0; i < numbers.length; i++) {
    //         int start = i;
    //         for (int j = i; j < numbers.length; j++) {
    //             int end = j;
    //             for (int k = start; k <= end; k++) {
    //                 System.out.print(numbers[k] + " ");
    //             }
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total sub arrays are : "+ts);
    // }

    // public static void main(String[] args) {
    //     {
    //         int numbers[] = {2,4,6,8,10};
    //         printSubarray(numbers);
    //     }
    // }


//  max subarray sum
public static void printSubarraySum(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
            prefix[0] = numbers[0];

            for( int i = 1;i<prefix.length;i++)
            {
                prefix[i] = prefix[i-1]+ numbers[i];
            }

        for (int i=0; i<numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++) {
                int end = j;
                int currentsum =  start==0 ? prefix[end] : prefix[start-1];
                if(maxsum<currentsum)
                {
                    maxsum = currentsum;
                }    
            }
        }
        System.out.println("Max Sum : "+maxsum);
    }

    public static void main(String[] args) {
        {
            int numbers[] = {1,-2,6,-1,3};
            printSubarraySum(numbers); 
        }
    }
}
