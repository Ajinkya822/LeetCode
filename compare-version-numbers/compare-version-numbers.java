class Solution {
    public int compareVersion(String version1, String version2) {
        String []v1=version1.split("\\.");
        String []v2=version2.split("\\.");
        int i=0;
        int j=0;
        int temp1=0;
        int temp2=0;
        while(i<v1.length && j<v2.length){
            int t=0;
            temp1=0;
            temp2=0;
            while(t<v1[i].length() && v1[i].charAt(t)=='0'){
                t++;
            }
            while(t<v1[i].length()){
                temp1=(temp1*10)+(v1[i].charAt(t)-'0');
                t++;
            }
            t=0;
            while(t<v2[j].length() && v2[j].charAt(t)=='0'){
                t++;
            }
            while(t<v2[j].length()){
                temp2=(temp2*10)+(v2[j].charAt(t)-'0');
                t++;
            }
            if(temp1<temp2)
                return -1;
            if(temp1>temp2)
                return 1;
            i++;
            j++;
            
        }
        if(i<v1.length){
            while(i<v1.length){
                int t=0;
                while(t<v1[i].length()){
                    if(v1[i].charAt(t)!='0')
                        return 1;
                    t++;
                }
                i++;
            }
        }
        
        else if(j<v2.length){
            while(j<v2.length){
                int t=0;
                while(t<v2[j].length()){
                    if(v2[j].charAt(t)!='0')
                        return -1;
                    t++;
                }
                j++;
            }
        }
        return 0;
    }
}