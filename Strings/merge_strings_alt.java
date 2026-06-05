class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i; String merged="";
        int min = Math.min(word1.length(), word2.length());

       for(i = 0; i < min; i++) {
           merged += word1.charAt(i);
           merged += word2.charAt(i);
}
while(i < word1.length()) {
            merged += word1.charAt(i);
            i++;
        }

        while(i < word2.length()) {
            merged += word2.charAt(i);
            i++;
        }
    
        return merged;
    }
}
