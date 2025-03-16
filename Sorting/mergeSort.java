class Solution {
    static void merger(int [] arr, int l, int mid,int r) {
        List<Integer> li = new ArrayList<>();
        int left = l;
        int right = mid+1;
        
        while(left <= mid && right <= r){
            if(arr[left] < arr[right]) {
                li.add(arr[left++]);
            } else {
                li.add(arr[right++]);
            }
        }
        
        while(left <= mid) {
            li.add(arr[left++]);
        }
        
        while(right <= r) {
            li.add(arr[right++]);
        }
        
        for(int i = 0; i < li.size(); i++) {
            arr[i+l] = li.get(i);
        }
    }
    

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merger(arr,l,mid,r);
    }
}

