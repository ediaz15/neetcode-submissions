class Solution {
    public int removeElement(int[] nums, int val) {
        //slow and fast pointer
        //once slow pointer is at a number that is NOT the val, switch fast and slow and remove slow
        //if nums[fast] == val -> remove nums[fast] fast++ and slow == fast
        //numbers can be at 101?
        //k is a counter -> must be updated for every number that is removed
        //k = nums.length
        //for every number removed -> subtract k

        int slow = 0;
        int fast = 0;
        int k = nums.length;
        while(fast < nums.length){
            if(nums[fast] == val){
                //remove
                nums[fast] = 101;
                slow = fast;
                k--;
            } 
            fast++;
        }
        Arrays.sort(nums);
        return k;
    }
}