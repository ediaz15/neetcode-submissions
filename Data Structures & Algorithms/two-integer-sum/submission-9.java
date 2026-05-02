class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //difference = target - i;
        //insert indexes, if difference is found, return i
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if(map.containsKey(difference)){
                int targetIndex = map.get(difference);
                arr[0] = targetIndex;
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}
