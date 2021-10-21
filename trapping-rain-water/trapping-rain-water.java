class Solution {
    public int trap(int[] height) {
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        leftMax[0]=0;
        //leftMax[1]=height[0];
        int lmax=height[0];
        rightMax[height.length-1]=0;
       // rightMax[height.length-2]=height[height.length-1];
        int rmax=height[height.length-1];
        for(int i=1;i<height.length;i++){
            leftMax[i]=lmax;
            if(height[i]>lmax)
                lmax=height[i];
        }
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=rmax;
            if(height[i]>rmax)
                rmax=height[i];
        }
        for(int i:height)
            System.out.print(i+" ");
        System.out.println("");
        for(int i:leftMax)
            System.out.print(i+" ");
        System.out.println("");
        for(int i:rightMax)
            System.out.print(i+" ");
        System.out.println("");
        int op=0;
        for(int i=1;i<height.length-1;i++){
            int temp=0;
            temp=Math.min(leftMax[i],rightMax[i])-height[i];
            System.out.print(temp+" ");
            if(temp>0){
                op+=temp;
            }
        }
        
        return op;
    }
}