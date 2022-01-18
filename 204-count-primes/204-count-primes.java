class Solution {
    public int countPrimes(int n) {
        boolean []isPrime=new boolean[n+1];
        int count=0;
        for(int i=0;i<=n;i++){
            isPrime[i]=true;
        }
        int q=0;
        for(int i=2;i<=n;i++){
            if(isPrime[i]==true){
                q=n/i;
                for(int j=2;j<=q;j++){
                    isPrime[i*j]=false;
                }   
            }
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]==true){
                count++;
            }
        }
        return count;
    }
}