class Solution {
    public void moveZeroes(int[] nums) {
        //two pointer approach
        //fast and slow pointer variation

        //slow pointer will be set on zero values
        //fast pointer will be set on non zero values
        //both start on same side
        //fast pointer will look for non zero values and swap with slow pointer value
        //this will place the values of non zero to the back while the zero values go to the front
        //then we update the slow pointer to increment by 1
        //fast pointer scans till end of array then starts again in slow pointer

        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            //fast pointer refers to non zero value
            if(nums[fast] != 0){
                //swap values from slow and fast
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
            fast++;
        }
    }
}