class Solution {
    public int mySqrt(int x) {
        int answer=0;
        int left=0;
        int right=x/2;
        if(x==0)
            return 0;
        if(x<=2)
            return 1;
        while(left<=right){
           int mid=left + (right - left) / 2;
           long square=(long)mid*mid;
            if(square>x)
                right=mid-1;
            else if(square<x)
                left=mid+1;
            else
                return mid;
        }
        return right;
        
    }
}