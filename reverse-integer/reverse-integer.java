class Solution {
    public int reverse(int x) {
        
        int num=0;
        if(x==-2147483648)
            return 0;
        if(x<0){
            num=-1*(x);    
        }
        else{
            num=x;
        }
        
        int q=0;
        int r=0;
        StringBuilder sb=new StringBuilder();
        do{
            q=num/10;
            r=num%10;
            sb.append(r);
            num=num/10;
        }while(num>0);
        
        System.out.print(sb);
        long temp=0;
        temp=Long.parseLong(sb.toString());
        if(temp>Integer.MAX_VALUE || temp<Integer.MIN_VALUE)
            return 0;
        num=(int) temp;
        if(x<0)
            return num*(-1);
        else
            return num;
        
    }
}