https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Pair with given sum in a sorted array
Difficulty: EasyAccuracy: 26.04%Submissions: 51K+Points: 2
You are given an integer k and an array arr[]. You have to find numbers of pairs in array arr[] which sums up to k. It is given that the elements of the array arr[] are distinct and in sorted order.
Note: pair {a, b} and pair {b, a} are considered the same. Also, an element cannot pair with itself, i.e., pair {a, a} is invalid.

Examples :

Input: k = 8, arr[] = [1, 2, 3, 4, 5, 6, 7]
Output: 3
Explanation: There are 3 pairs which sum up to 8 : {1, 7}, {2, 6}, {3, 5}
Input: k = 98, arr[] = [1, 2, 3, 4, 5, 6, 7]
Output: 0
Explanation: There are no pairs which sum up to 98.


  
class Solution {

    int countPair(int k, int arr[]) {
          int start = 0;
        int end = arr.length-1;
        int count = 0;
        while(start<end){
            if(arr[start]+arr[end] == k){
                count++;
                start++;
                end--;
            }
            else if(arr[start]+arr[end] < k){
                start++;
            }
            else{
                end--;
            }
        }
        return count;
    }
}
