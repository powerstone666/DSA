https://www.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/1


Sorted subsequence of size 3
Difficulty: MediumAccuracy: 25.95%Submissions: 66K+Points: 4
You are given an array arr, you need to find any three elements in it such that arr[i] < arr[j] < arr[k] and i < j < k.

Note:

The output will be 1 if the subsequence returned by the function is present in the array arr
If the subsequence is not present in the array then return an empty array, the driver code will print 0.
If the subsequence returned by the function is not in the format as mentioned then the output will be -1.
Examples :

Input: arr = [1, 2, 1, 1, 3]
Output: 1
Explanation: A subsequence 1 2 3 exist.
Input: arr = [1, 1, 3]
Output: 0
Explanation: No such Subsequence exist, so empty array is returned (the driver code automatically prints 0 in this case).


  class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
      int n = arr.length;
        List<Integer> res = new ArrayList<>();

        if (n < 3) {
            return res;  // No triplet is possible if array has less than 3 elements
        }

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Initialize leftMin array
        leftMin[0] = -1;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[minIndex]) {
                leftMin[i] = -1;
                minIndex = i;
            } else {
                leftMin[i] = minIndex;
            }
        }

        // Initialize rightMax array
        rightMax[n - 1] = -1;
        int maxIndex = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[maxIndex]) {
                rightMax[i] = -1;
                maxIndex = i;
            } else {
                rightMax[i] = maxIndex;
            }
        }

        // Find the triplet
        for (int i = 1; i < n - 1; i++) {
            if (leftMin[i] != -1 && rightMax[i] != -1) {
                res.add(arr[leftMin[i]]);
                res.add(arr[i]);
                res.add(arr[rightMax[i]]);
                return res;
            }
        }

        return res; 
    }
}
