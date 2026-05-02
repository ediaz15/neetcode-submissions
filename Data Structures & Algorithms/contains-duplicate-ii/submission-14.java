class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //true if two indeces i and j 's values are equal and are are abs(i-j)<=k, can infer its within the window
        //a set will be used to store the values we have seen
        HashSet<Integer> window = new HashSet<>();
        //left and right are the pointers
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            //check if the windowSize is <= to k
            int windowSize = right - left;
            //if our current window size is larger than allowed
            if(windowSize > k){
                //remove and contract from left side
                window.remove(nums[left]);
                left++;    
            }
            //if a dupe is found when expanding to the right
            if(window.contains(nums[right])){
                return true;
            }
            window.add(nums[right]);
        }
        return false;
    }
}