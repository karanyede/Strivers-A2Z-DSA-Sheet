class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        int j;
        if(low<high)
        {
            j=partition(arr,low,high);
            quickSort(arr,low,j-1);
            quickSort(arr,j+1,high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i=low+1;
        int j=high ;
        int temp;
        while(i<=j)
        {
             while (i <= high && arr[i] <= pivot) { // Prevent out-of-bounds
                i++;
            }
            while (j >= low && arr[j] > pivot) { // Prevent out-of-bounds
                j--;
            }
            if(i<j)
            { // swap arr[i] and arr[j]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        temp=arr[low];
        arr[low]= arr[j];
        arr[j] = temp;
        return j;
    }
}

