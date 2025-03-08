class Solution {
    public void reverseString(char[] s) {
        //Store the last character in the array
        int last = s.length-1;
        //Aplly loop
        for(int i=0;i<s.length;i++){
        //if true
            if(last>i){
            //Swap last with first
            char temp = s[i];
            s[i]= s[last];
            s[last]= temp;
            }
            // Decrement the last 
            last--;
        }
    }
}
