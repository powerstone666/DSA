https://www.geeksforgeeks.org/problems/consecutive-elements2306/1

Remove Consecutive Characters
Difficulty: BasicAccuracy: 53.35%Submissions: 88K+Points: 1
Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

Example 2:

Input:
S = aabaa
Output:  aba
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
'a' at fifth position is appearing
2nd time consecutively.

  
class Solution{
    public String removeConsecutiveCharacter(String S){
        String res=S.charAt(0)+"";
        int right=1;
        for(int i=0;i<S.length()-1;i++)
        {
            if(S.charAt(i)==S.charAt(right))
            {
                right++;
            }
            else{
                res+=S.charAt(right);
                right++;
            }
        }
        return res;
    }
}
