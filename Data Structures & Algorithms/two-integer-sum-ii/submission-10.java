class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //null or neg values?
            //clarifies the contraints
            //values are sorted -> non dec order so asc
            //NO additional DS can be used to respect the space complexity
            //appropriate implementaiton would be two pointers


            //left will start in beg
                //Point to the leftest element at pos left
            //right will start on end
                //point to the rightmost element at pos right
            //will get the values at positions
            //check if they are greater or lesser than the target value
                //if greater:
                    //SINCE the right side is the bigger number due to sorting
                        //decrement right
                //if lesser:
                    //since the left side is the smaller number
                        //increment left
            //THERE WILL ALWAYS BE A VALID SOLUTION
            //we need to stop this loop once we have our two pointers meet in the middle


            int left = 0;
            int right = numbers.length - 1;
            while(left < right){
                if((numbers[left] + numbers[right]) > target){
                    right--;
                } else if((numbers[left] + numbers[right]) < target){
                    left++;
                } else {
                    return new int[]{++left, ++right};
                }
            }
            return new int[]{};
    }
}
