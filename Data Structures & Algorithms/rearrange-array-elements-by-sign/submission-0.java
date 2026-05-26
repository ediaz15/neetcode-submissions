class Solution {
    public int[] rearrangeArray(int[] nums) {
        //since arr len is even, we can do i = 0, j = 1 to start pair
        //need a new array where we can store result
        //need two pointers that will insert the values correctly into result
            //i jumps 2 if current num is positive
            //j jumps 2 if current num is negative
        //need a third pointer inside nums arr to check for that number
        //iterate thru nums using third pointer and update the result arr as we go with the checks
        //return result

        int[] result = new int[nums.length];
        int i = 0;
        int j = 1;

        int k = 0;
        while(k < nums.length){
            if(nums[k] > 0){
                //insert positive number in pos i
                result[i] = nums[k];
                i += 2;
            } else if(nums[k] < 0){
                //insert negative number at pos j
                result[j] = nums[k];
                j += 2;
            }
            k++;
        }
        return result;
    }
}