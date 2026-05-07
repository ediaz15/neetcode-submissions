class Solution {
    public int subarraySum(int[] nums, int k) {
        //need to find numbers that equal to k
        //nums[i] + nums[j] = k
        //switch to nums[i] = prefixSum - k
        //since we want a combination for a subarray, use prefixSum and Hashmap
        //hashmap will store past prefixSums and their frequency
        //as we iterate through nums
        //if we find a prefixSum thats in the map and equals to target, increment count



        //edge case, with prefix sum when we init it
        //0 is the current prefixSum when we start, so we insert (0,1)
        //(currentPrefixSum, frequency)
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        int count = 0; //count number of subarrays
        int prefixSum = 0;
        prefixSumMap.put(prefixSum, 1);


        for(int i = 0; i < nums.length; i++){
            //calculate the running sum as you go
            prefixSum += nums[i];
            //if the operation: prefixSum = k results in the current ith element, then that subaray should work
            if(prefixSumMap.containsKey(prefixSum - k)){
                //get its current frequency and add it to count
                count += prefixSumMap.get(prefixSum - k);
            }
            
            //put current prefixSum and get its frequency and increment if there previously
            //using getOrDefault, if we haven't seen past prefixSum, use a 1, otherwise get current and increment value
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}