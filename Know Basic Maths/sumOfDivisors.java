class Solution {
    public static int sumOfDivisors(int n) {
        // initialize sum
        int sum=0;
        // Iterate over each number j (which is a divisor)
        for(int i =1;i<=n;i++){
            //i appears as devisor
            sum = sum + i*(n/i);
        }
        return sum;
    }    
}
