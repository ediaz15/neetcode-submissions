class Solution {
    public int[] sortedSquares(int[] nums) {
        //square all numbers
        //iterate through array
        //compare the numbers, then based on whichever is bigger, decrement or increment a pointer

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}