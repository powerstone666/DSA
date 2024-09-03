https://www.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Largest Number formed from an Array
Difficulty: MediumAccuracy: 37.82%Submissions: 160K+Points: 4
Given an array of strings arr[] of length n representing non-negative integers, arrange them in a manner, such that, after concatenating them in order, it results in the largest possible number. Since the result may be very large, return it as a string.

Examples:

Input: n = 5, arr[] =  {"3", "30", "34", "5", "9"}
Output: "9534330"
Explanation: Given numbers are  {"3", "30", "34", "5", "9"}, the arrangement "9534330" gives the largest value.
Input: n = 4, arr[] =  {"54", "546", "548", "60"}
Output: "6054854654"
Explanation: Given numbers are {"54"


  using comparator where ij and ji gets compared
class Solution {
    String printLargest(int n, String[] arr) {
        
      Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                // Compare in reverse order to get the largest number first
                return ba.compareTo(ab);
            }
        });

        // If the largest element is "0", the result is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted array elements to form the largest number
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }

        return result.toString();
    }
}
