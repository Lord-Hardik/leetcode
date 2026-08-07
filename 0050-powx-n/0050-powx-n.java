class Solution {
    public double myPow(double x, int n) {
        long binfrom = n;
        double ans = 1;
        if(n == 0) return 1.00;
        if(x == 0) return 0.00;
        if(x == 1) return 1.00;
        if(x == -1 && n%2 == 0) return 1.00;
        if(x == -1 && n%2 != 0) return -1.00;

        if(n<0){
            x = 1/x;
            binfrom = -binfrom;
        }
         while(binfrom > 0){
            if(binfrom%2 == 1){
                ans *= x;
             }

             x *= x;
             binfrom /= 2;
         }

        return ans;
    }
}