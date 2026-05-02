class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //just 1 pass between the nums array
        //count and max are yhere to keep track of max amt of sequential 1s
        //if the current num we are in is a 0
            //update max by using math.max(count, max)
            //reset count
        //increment count

        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            //stop when we encounter a 0
            if(nums[i] == 0){
                //update max to check count
                max = Math.max(count, max);
                //count is reset since we arent in a 1s sequence no more
                count = 0;
            } else {
                //assume that we are counting 1's here and increment count and index
                count++;

            }
        }
        //update max since the last count wasnt checked due to the terminating loop!
        max = Math.max(count, max);
        return max;
    }
}