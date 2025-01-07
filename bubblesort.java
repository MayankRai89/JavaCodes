// impot java.util.*;
public class bubblesort {

    public static void main(String[] args) {
        // int arr[] = {1, 4, 2, 6, 3, 5};
        int arr[] = {1, 4, 2, 6, 3, 5};
        // Bubble_sort(arr);
        // selectionsort(arr);
        // Insertionsort(arr);
        //Arrays.sort(arr);//inbuilt funtion
        //Arrays.sort(arr, Collections.reverseOrder());//inbuilt funtion
        countingsort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

// Bubblesort
    // public static void Bubble_sort(int arr[]) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         for (int j = 0; j < arr.length - 1 - i; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    // }
// selection sort 
    // public static void selectionsort(int arr[]) 
    // {
    //     for(int i = 0; i<arr.length-1; i++)
    //     {
    //         int minPos=i;
    //         for(int j=i+i; j<arr.length; j++)
    //         {
    //             if(arr[minPos] > arr[j])
    //             {
    //                 minPos=j;
    //             }
    //         }
    //         // swap
    //         int temp = arr[minPos];
    //         arr[minPos]=arr[i];
    //         arr[i]=temp;
    //     }
    // }
// Insertionsort
    // public static void Insertionsort(int arr[])
    // {
    //     for(int i=1;i<arr.length;i++)
    //     {
    //         int curr=arr[i];
    //         int prev = i-1;
    //         while(prev>=0 && arr[prev] > curr)
    //         {
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]=curr;
    //     }
    // }
// counting sort
    public static void countingsort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
