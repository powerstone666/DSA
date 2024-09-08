https://leetcode.com/problems/valid-anagram/

242. Valid Anagram
Easy

12284

408

Add to List

Share
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

  class Solution {
    public boolean isAnagram(String s, String t) {
       char[] a=s.toCharArray();
        Arrays.sort(a);
        char[] b=t.toCharArray();
        Arrays.sort(b);
        String res1=new String(a);
        String res2=new String(b);
        if(res1.equals(res2))
        {
           return true;
        }
        return false;
    }
}
