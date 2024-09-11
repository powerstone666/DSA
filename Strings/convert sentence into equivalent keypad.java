https://www.geeksforgeeks.org/problems/convert-a-sentence-into-its-equivalent-mobile-numeric-keypad-sequence0547/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Convert a sentence into its equivalent mobile numeric keypad sequence
Difficulty: EasyAccuracy: 45.52%Submissions: 34K+Points: 2
Given a sentence in the form of a string in uppercase, convert it into its equivalent mobile numeric keypad sequence. Please note there might be spaces in between the words in a sentence and we can print spaces by pressing 0.



 

Example 1:

Input:
S = "GFG"
Output: 43334
Explanation: For 'G' press '4' one time.
For 'F' press '3' three times.
Example 2:

Input:
S = "HEY U"
Output: 4433999088
Explanation: For 'H' press '4' two times.
For 'E' press '3' two times. For 'Y' press '9' 
three times. For white space press '0' one time.
For 'U' press '8' two times.

  class Solution 
{ 
    String printSequence(String S) 
    { 
        String[] st={
            "2","22","222","3","33","333","4","44","444",
            "5","55","555","6","66","666","7","77","777","7777",
            "8","88","888","9","99","999","9999"
        };
        String res="";
        int n=S.length();
        for(int i=0;i<n;i++)
        {
            if(S.charAt(i)==' ')
            {
                res+="0";
            }
            else{
                int indx=S.charAt(i)-'A';
                res+=st[indx];
            }
        }
        return res;
    }
}
