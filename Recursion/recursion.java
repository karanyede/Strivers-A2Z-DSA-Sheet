class Solution {
    // Initialize a Count variable with 0 
    int count = 0 ;
    public void printNos(int n) {
        
        //check if the value of n is equals to the value of count
        if(n==count){
            //if true then return 
            return;
        }
        //otherwise
        else{
            //increment count by 1
            count++;
            //print value of count
            System.out.print(count+" ");
            //
            printNos(n);
        }
    }
}
