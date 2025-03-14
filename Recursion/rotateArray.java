import java.util.*; 
class Solution{ 
  //For this question 
  //first reversed the entire array and 
  //now reverse the half array untill key
  //do same for remaining elements in array 
  public void rotate(int[]nums,int k)
  { 
    int n=nums.length; 
    k%=n; 
    reverse(nums,0,n-1); 
    reverse(nums,0,k-1); 
    reverse(nums,k,n-1); 
  } 
  private void reverse(int[]nums,int start,int end)
  { 
    while(start<end){ 
      int temp=nums[start]; 
      nums[start]=nums[end]; 
      nums[end]=temp; start++; 
      end--; 
    } 
  } 
}
