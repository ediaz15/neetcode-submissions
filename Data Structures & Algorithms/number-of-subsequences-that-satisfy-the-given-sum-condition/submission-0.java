class Solution {
    public int numSubseq(int[] nums, int target) {
        // combination <= target
        //slow and fast pointer? :v
        //two pointers need the array to be sorted
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int MOD = 1000000007;
        int count = 0;
        int[] pow = new int[nums.length];
        pow[0] = 1;

        //precalculate the combinations of numbers via 2^n where n is the size of the subseq arr
        //order doesnt matter too
        //calculate using power[i] = (power[i - 1] * 2) % MOD
            //since calculations are 2^n, we store them in the arr, but we do % MOD to ensure we are within int limits
        for(int l = 1; l < nums.length; l++){
            pow[l] = (pow[l - 1] * 2) % MOD;
        }

        //using pointers
        //check if the L and R are <= target. if so add to count (use calculation again)
         //count = (count + pow[r - l]) % MOD; //same idea is applied here BUT we use r - l to denote space in between subsequence and figure out where to go for num of calcs
         //increment l
        //decrement r  if target > L + R
        //instead of <, we use <= to ensure we count numbers itself as we go thru arr
        while(i <= j){
            if(nums[i] + nums[j] <= target){
                count = (count + pow[j - i]) % MOD;
                i++;
            } else {
                //nums[i] + nums[j] > target
                j--;
            }
        }
        return count;
    }
}