https://www.geeksforgeeks.org/problems/c-corresponding-position-in-the-two-strings-that-hold-exactly-the-same-characters5013/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Same characters in two strings
Difficulty: EasyAccuracy: 67.48%Submissions: 7K+Points: 2
Given two strings A and B of equal length, find how many times the corresponding position in the two strings hold exactly the same character. The comparison should not be case sensitive. 

Example 1:

Input:
A = choice 
B = chancE
Output: 4
Explanation: characters at position 0, 1, 4 and 5
are same in the two strings A and B.
Example 2:

Input:
A = Geek 
B = gang
Output: 1
Explanation: charactera at position 0 is the
same in the two strings A and B.


  class Solution 
{ 
    int sameChar(String A, String B) 
    {
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            if(Character.toLowerCase(A.charAt(i))==Character.toLowerCase(B.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
} 
