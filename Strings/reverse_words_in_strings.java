class Solution {
    public String reverseWords(String s) {
        int i;String res="";
    String st[]= s.trim().split("\\s+");

    for(i=st.length-1;i>=0;i--)
    {
        res=res+st[i];
        if(i != 0) {
                res += " ";
        }

    }

        return res;
    }
}
