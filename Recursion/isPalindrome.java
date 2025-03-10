class Solution {
    public boolean isPalindrome(String s) {
        //eplacing all non(^) alphabetic Characters from string with "" (Emplty).
        //Convert the string into Lowercase by using toLowerCase() Method.
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        //Initialize First and last character variables for comparison.
        int first = 0;
        int last = s.length()-1;
        //Continue Comparison
        while(first<last){
            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
            else{
                first++;
                last--;
            }
        }
      //if loop Done 
        return true;
    }
}
