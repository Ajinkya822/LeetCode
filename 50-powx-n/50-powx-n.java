class Solution {
    public double myPow(double x, int n) {
        // if(n==0)
        //     return 1.0;
        // if(n==1)
        //     return x;
        // if(n<0){
        //      return   (myPow(x,n/2)*myPow(x,n/2))/x;
        //     //myPow(1/x,-n)
        // }
        // double result=myPow(x*x,n/2);
        // if(n%2==1)
        //     result*=x;
        // return result;
        
        double temp=x;
            if(n==0)
                return 1;
            temp=myPow(x,n/2);
            if(n%2==0)
            return temp*temp;
            else 
            {
            if(n > 0)
                return x*temp*temp;
            else
                return (temp*temp)/x;
            }
}
}
