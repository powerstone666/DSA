https://leetcode.com/problems/valid-parentheses/

20. Valid Parentheses
Easy

24325

1803

Add to List

Share
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true



  class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='(' || a=='{' || a=='[')
            {
                 st.push(a);
            }
            else{
                if(st.empty())
                {
                    return false;
                }
                char temp=st.pop();
              if ((a == ')' && temp != '(') || (a == '}' && temp != '{') || (a == ']' && temp != '[')) 
                    return false;
            }
        }
       return st.empty();
    }
}
