238. Product of Array Except Self
Medium

22796

1436

Add to List

Share
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
        int[] res = new int[n];

        // Initialize the result array
        res[0] = 1; // there is no element to the left of the first element

        // Calculate the product of all elements to the left of each index
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Calculate the product of all elements to the right and multiply with the left product
        int rightProduct = 1; // there is no element to the right of the last element
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }
}
