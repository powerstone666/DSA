https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

53. Find Minimum in Rotated Sorted Array
Medium

13372

595

Add to List

Share
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 

  class Solution {
    public int findMin(int[] nums) {
    int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
              min=Math.min(nums[i],min);
        }
        return min;
    }
}


//optimal use binary search 
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        // If the array is not rotated (the smallest element is the first element)
        if (nums[left] <= nums[right]) {
            return nums[left];
        }
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the middle element is the smallest
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            
            // Determine which side is unsorted
            if (nums[mid] >= nums[left]) {
                // Left side is sorted, so the pivot point is in the right half
                left = mid + 1;
            } else {
                // Right side is sorted, so the pivot point is in the left half
                right = mid - 1;
            }
        }
        
        return -1;  // This line should never be reached if the input is a valid rotated sorted array
    }
}
