class Solution {
    void selectionSort(int[] arr) {
      //First we need to compare whole array with index 0 and swap with smallest element
      //then move to next index and do the same with next indexes
        for(int i=0;i<arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
    }
}
