https://www.geeksforgeeks.org/problems/longest-prefix-suffix2527/1

Longest Prefix Suffix
Difficulty: HardAccuracy: 27.91%Submissions: 120K+Points: 8
Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

NOTE: Prefix and suffix can be overlapping but they should not be equal to the entire string.

Examples :

Input: str = "abab"
Output: 2
Explanation: "ab" is the longest proper prefix and suffix. 
Input: str = "aaaa"
Output: 3
Explanation: "aaa" is the longest proper prefix and suffix. 
Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)



  class Solution {
    int lps(String str) {
         int i=1;
       int j=0;
       int n=str.length();
       int[] storeLength=new int[n];
       while(i<n)
       {
           if(str.charAt(i)==str.charAt(j))
             storeLength[i++]=++j;
        else{
            if(j>0)
            {
                j=storeLength[j-1];
            }
            else{
                i++;
            }
        }
       }
       return storeLength[n-1];
    }
}
