class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int i; char ch; String result ="";
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='*')
            {
                stack.pop();

            }
            else
            stack.push(ch);
        }
        while(!stack.isEmpty())
        {
            result=stack.pop()+result;
        }
        return result;
        
    }
}
