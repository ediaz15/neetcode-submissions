class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //order DOESNT seem to match as much
        //evens on left and odds on right
        //inwards traversal maybe..nah uni
        //slow pointer WILL be on the current odd num
        //fast pointer WILL be the on the next even num
        //swap only happens when slow is odd and fast is even [ig the slow odd wasnt necessary :v]
            //increment slow if swap happens
        //what if we get two even numbers back to back on slow..
            //increment slow
        //stop when fast reaches the end :v

        if((nums.length == 0) || (nums.length == 1)){
            return nums;
        }
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            //swap when fast is even swap
            if(nums[fast] % 2 == 0){
                //swap
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
                fast = slow;
            }
            fast++;
        }
        return nums;
    }
}