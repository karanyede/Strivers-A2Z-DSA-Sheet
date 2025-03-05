class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // initialize and declair the initial values for GCD LCM
        int gcd=1,lcm=1,prod=a*b;
        // if a and b are non Zero
        while(a!=0 && b!= 0){
            if(a>b){
                a%=b;
            }
            else{
                b%=a;
            }
        }
        // if a or b is Zero
        if(a==0){
                gcd= b;
        }
        if(b==0){
            gcd= a;
        }
        // LCM formula
        lcm = prod/gcd;
        // return result of LCM and GCD
        return new int[]{lcm,gcd};
    }
}
