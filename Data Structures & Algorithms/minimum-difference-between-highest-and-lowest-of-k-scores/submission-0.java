class Solution {
    public int minimumDifference(int[] nums, int k) {
        //sort array
        //sliding window of size k is used
        //store/update min
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = k - 1;
        while(j < nums.length){
            min = Math.min(nums[j] - nums[i], min);
            i++;
            j++;
        }
        return min;
    }
}