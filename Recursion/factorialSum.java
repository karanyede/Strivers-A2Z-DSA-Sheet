class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
      //create a result ArrayList to return as a result 
        ArrayList<Long> result = new ArrayList<Long>();
        //Iterate over ArrayList 
        for(int i=1; i<=n; i++){
          //
        if(factorial(i) <= n) result.add(factorial(i));
       if(factorial(i) > n) return result;
      }
      //return result
    return result;
    }
    //factorial Method
     public static long factorial(long n){
     if(n==1) return 1;
   return n*factorial(n-1);
  }
}
