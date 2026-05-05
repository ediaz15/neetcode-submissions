class Solution {
    public int[] sortedSquares(int[] nums) {
        //square all numbers
        //iterate through array
        //compare the numbers, then based on whichever is bigger, decrement or increment a pointer


        int[] result = new int[nums.length];

        //going to do an inwards traversal
        int left = 0;
        int right = nums.length - 1;
        int spot = nums.length - 1;
        while(left <= right){
            //compare Math.abs(left) and Math.abs(right)
                //if left bigger
                    //put that num into result[p]
                    //increment left
                    //decrement p
                //if right bigger
                    //put that num into result[p]
                    //decrement right
                    //decrement p
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[spot] = nums[left] * nums[left];
                left++;
                spot--;
            } else {
                //in the case that right is bigger or equal to left
                result[spot] = nums[right] * nums[right];
                right--;
                spot--;
            }
        }
        return result;
    }
}