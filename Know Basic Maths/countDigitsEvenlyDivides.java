class Solution{
  public int evenlyDivides(int n){
    //Initialize empty Count and last digit variable
    int count=0;
    int last;
    //Initialize a variable to store n
    int Num = n;
    //check condition 
    while(n!=0){
      //Store last digit 
      last = n%10;
      //Now check if last digit evenly devides the given number 
      if(last!=0 && Num%last==0){
        //if true then increment count by 1 
        count++;
      }
      //Remove the last digit from the number and check again
      n/=10;
    }
    //return the count 
    return count;
  }
}
