class Solution {
    public int[] twoSum(int[] nums, int target) {
        //num1 + num2 = target;
        //num2 = target - num1;
        //complement = target - num[i];

        //if our hashmap HAS a complement -> return indeces
            // check if hashmap contains that key (complement which would be a past number)
            //get its index
            //return the array with THAT index and current index
        //{num[i], index}
        
        
        //
        int complement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
