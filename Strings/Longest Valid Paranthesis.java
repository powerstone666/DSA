https://www.geeksforgeeks.org/problems/longest-valid-parentheses5657/1


Longest valid Parentheses
Difficulty: HardAccuracy: 26.13%Submissions: 108K+Points: 8
Given a string str consisting of opening and closing parenthesis '(' and ')'. Find length of the longest valid parenthesis substring.

A parenthesis string is valid if:

For every opening parenthesis, there is a closing parenthesis.
Opening parenthesis must be closed in the correct order.
Examples :

Input: str = ((()
Output: 2
Explaination: The longest valid parenthesis substring is "()".
Input: str = )()())
Output: 4
Explaination: The longest valid parenthesis substring is "()()".



  class Solution{
    static int maxLength(String S){
      Stack<Integer> s=new Stack<>();
      s.push(-1);
      int max=0;
      for(int i=0;i<S.length();i++)
      {
          char a=S.charAt(i);
          if(a=='(')
          {
              s.push(i);
          }
          else{
              s.pop();
              if(!s.isEmpty())
              {
                  max=Math.max(max,i-s.peek());
              }
              else{
                  s.push(i);
              }
          }
      }
      return max;
    }
}
