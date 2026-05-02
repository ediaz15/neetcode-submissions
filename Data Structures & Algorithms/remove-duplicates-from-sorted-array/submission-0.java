class Solution {
    public int removeDuplicates(int[] nums) {
        //inplace algo to remove duplicates in nums array
        //int k should represent the nums that are unique after the algo
        //we could decrement k each time we remove a dupe (init k = nums.length)

        //two pointers is recommended here?

        //slow and fast pointer
        //slow pointer starts in the beginning
        //fast pointer is going to check for dupes

        //fast pointer WILL increment UNTIL we hit a num thats not equal to the num[slow]
        //basically -> nums[j] != nums[i]

            //what we do here is: nums[slow+1] = nums[fast]
            //                    slow++;
        //the condition is that we stop when fast reaches the end
        //we basically only keep the unique elements at the beginnning
        //and let the fast pointer skip dupe elements of slow pointer until we find a non dupe then replace the value there

        //how to keep track of unique elements tho..
        //since i is the slow pointer thats where the last unique element is at
        //we just k = i+1;


        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            if(nums[fast] != nums[slow]){
                nums[slow+1] = nums[fast];
                slow++;
            }
            fast++;
        }

        int k = slow+1;
        return k;
    }
}