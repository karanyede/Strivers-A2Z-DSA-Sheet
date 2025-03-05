class Solution {
    static boolean armstrongNumber(int n) {
        //Step 1: Store the original number to compare later
        int temp= n;
        //Step 2: Variable to store the sum of the cubes of the digits
        double res = 0;
        //Step 3: Loop to process each digit of the number
        while(n!=0){
            //Step 4: Get the last digit of the number
            int digit = n%10;
            // Step 5: Add the cube of the digit to the result
            res = res + Math.pow(digit,3);
            // Step 6: Remove the last digit from the number
            n/=10;
        }
        // Step 7: Check if the sum of cubes (res) is equal to the original number or not
        if(res==temp){
            return true; // The number is an Armstrong number
        }
        else{
            return false; // The number is not an Armstrong number
        }
    }
}
