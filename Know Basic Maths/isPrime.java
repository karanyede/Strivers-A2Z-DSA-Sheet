class Solution {
    static boolean isPrime(int n) {
        // for 1 and less
        if(n<=1){
            return false;
        }
        //check for all devisors from 2 to n
        for(int i=2;i<n;i++){
            if(n%i==0){
                //if divisible return false
                return false;
            }
        }
        //if not return true
        return true;
    }
}
