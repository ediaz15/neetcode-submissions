class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //true if it has a good subarray or false if otherwise

        //good subarray : x is a multiple of k IF x = n*k, 0 is a multiple of k 
        //at least length two, sum of elements in subarray is a multiple of k

        //how to check if its a multiple of k:
        // x = n * k
        // handle the 0th case, to make sure that we dont look at the first val and return true, init (0,-1) where (remainder, frequency)
        //remainder = Current Prefix Sum % k (prefix sum + current num)
        //return true if good subarray found, else false
        //if we found a previous prefixMod, then we can return true
        //otherwise insert it, and if after the loop nothing works then return false


        HashMap<Integer, Integer> prefixModMap = new HashMap<>();
        //handle the 0 case
        //say we run into a number that returns 0 as remainder, we account for this by -1 so we ensure we also satisfiy the length requirement
        prefixModMap.put(0,-1);
        int prefixMod = 0;

        for(int i = 0; i < nums.length; i++){
            //as we go through array, update the sum for the prefix mod as well
            prefixMod = (prefixMod + nums[i]) % k;
            //check if the previous remainder is there that is both a multiple of k and sums up to k
            //we are incorrectly checking if the prefix Mod stuff was seen beforehand
            //we didnt check if its a subarray of 2
            if(prefixModMap.containsKey(prefixMod)){
                if(i - prefixModMap.get(prefixMod) > 1){
                    return true;
                }
            } else {
                prefixModMap.put(prefixMod, i);
            }
            //insert the operation into the map
            //remainder, index of the freq
        }
        // in the case that no good subarrays were found
        return false;
    }
}