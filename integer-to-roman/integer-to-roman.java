class Solution {
    public String intToRoman(int num) {
        StringBuffer op=new StringBuffer();
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        
        int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        int i=0;
        while(num>0){
            while(num>=values[i]){
                num=num-values[i];
                op.append(map.get(values[i]));
            }
            i++;
        }

        
       
        
        
        return op.toString();
    }
}