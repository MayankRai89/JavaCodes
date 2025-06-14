public class Divide_Conquer_rule {
    // merge sort

    public static void printArr(int arr[])
    {
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergearray(int arr[], int si, int ei)
    {
        int mid = si + (ei - si)/2;
        mergearray(arr, si, mid);
        mergearray(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei)
    {
        int temp[] = new int[si-ei+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<= mid && j<= ei)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (j<= ei) {
            temp[k++] =arr[j++]; 
        }
        //  right part
        while (i<= mid) {
            temp[k++] = arr[i++];
        }

        // copy temp to original arr
        for(k = 0,i = si;k<temp.length;k++, i++)
        {
            arr[i]= temp[k];
        }
    }

    public static void main(String args[])
    {
        int arr[] = {6 , 3, 9, 5, 2, 8};
        mergearray(arr,0, arr.length-1);
       printArr(arr);
    }
}
