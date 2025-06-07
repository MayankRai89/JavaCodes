public class basic_sorting {
    // bobble sort
    public static void bubbleSort(int arr[]){
        for(int p = 0; p<arr.length-1;p++){
            for(int j = 0; j<arr.length- 1-p;j++){
                if (arr[p]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                     arr[j+1]= temp;
                }
            }
        }

    }
    public static void printArr(int arr[])
    {
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);

    }
}
