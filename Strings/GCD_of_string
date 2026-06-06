class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(! (str1+str2).equals(str2+str1)){
            return "";
        }
        int gcdl= gcd(str1.length(),str2.length());
        return str1.substring(0,gcdl);
    }
    
        public int gcd(int x, int y)
        {
            int remainder;
            while(y!=0)
            {
                remainder=x%y;
                x=y;
                y=remainder;

                
            }
            return x;
        }
}
