/*78. Subsets
Solved
Medium
Topics
Companies
Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.*/
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> al = new ArrayList<>();
        helper(nums,0,new ArrayList<>(),al);
        return al;

    }
    public void helper(int nums[],int ind,List<Integer> l,List<List<Integer>> al){
        int n = nums.length;
        if(ind==n){
            al.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[ind]);
        helper(nums,ind+1,l,al);
        l.remove(l.size()-1);
        helper(nums,ind+1,l,al);
    }
}
