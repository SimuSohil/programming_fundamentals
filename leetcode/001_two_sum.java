package leetcode;

/*
 * two sum problem:
 * let me first explain what the two sum problem is.
 * 
 * according to the two sum problem, an array 'nums' of integers and a 'target' value. 
 * we have to return the indices of the numbers in the array that sum up to the value of the target.
 * 
 * let us see some examples:
 * Example 1: Input: nums = [2,7,11,15], target = 9
 *            Output: [0,1]
 * the reason for the output is that, the values at the indices '0' and '1' sum up to target value i.e. '9'.
 * 
 * Example 2: Input: nums = [3,2,4], target = 6
 *            Output: [1,2]
 * the reason behind this output is that, the values at the indices '1' and '2' sum up to target value i.e. '6'.
 * 
 * We have solved the problem using Java.
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length ; j++){
                if ((nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}