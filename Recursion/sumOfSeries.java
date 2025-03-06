class Solution {
    int sumOfSeries(int n) {
        // Check for false conditions 
        if(n<1 || n>200){
            return 0;
        }
        // For n==1 return 1
        else if(n==1){
            return 1;
        }
        // result n cube plus n-i cube plus ...
        return n*n*n+sumOfSeries(n-1);
    }
}
