class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0;
        int j = 0;
        //TODO: verify syntax
        int minLen = Integer.MAX_VALUE;
        
        while(j < nums.length){
            sum += nums[j];
             while(sum >= target){
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[i];
                i++;
            }
                j++;
        }
        if(minLen == Integer.MAX_VALUE){
            return 0;
        }
        return minLen;
    }
}