class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        for(int i =0;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=current; 
        }
    }
}
