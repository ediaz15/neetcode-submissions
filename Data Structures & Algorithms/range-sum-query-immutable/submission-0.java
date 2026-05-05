class NumArray {
    private int[] nums; 
    
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        //prefix build
        //if the first index, left, is 0, then just return value found from prefix[right]
        //use formula prefix[i] = array[right] + prefix[left - 1]
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }
        if(left == 0){
            return prefix[right];
        }
        return prefix[right] - prefix[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */