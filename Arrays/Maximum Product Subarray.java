https://leetcode.com/problems/maximum-product-subarray/

152. Maximum Product Subarray
Medium

18650

715

Add to List

Share
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

  //modified kadanes algorithm to handle negative numbers in product

  class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(max*nums[i],nums[i]);
            min=Math.min(min*nums[i],nums[i]);
            result=Math.max(max,result);
        }
        return result;
    }
   
}
 
