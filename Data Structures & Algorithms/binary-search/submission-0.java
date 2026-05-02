class Solution {
    public int search(int[] nums, int target) {
        //start in middle, using two pointers here
        //if target > middle num -> visit left side of array
        //if target < middle num -> visit right side of array
        //if target == middle num -> return it
        //Base = if nums.length < 1

        if(nums.length < 1){
            return -1;
        }
        int i = 0;
        int j = nums.length - 1;
        while(i <= j){ 
            int mid = i + (j - i) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                i = mid + 1;
            }
            if(nums[mid] > target){
                j = mid - 1;
            }
        }
        return -1;
    }
}
