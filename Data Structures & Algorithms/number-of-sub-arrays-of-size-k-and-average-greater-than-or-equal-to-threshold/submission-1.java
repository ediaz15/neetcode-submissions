class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int currentSum = 0;
        //go up to k for the right side pointer
        for(int j = 0; j < k-1; j++){
            currentSum += arr[j];
        }
        //starting from beginning to the right pointer, slide and check if that average is >= threshold
        // stop at len - k (so our window doesnt go over)
        for(int i = 0; i <= arr.length - k; i++){
            currentSum += arr[i + k - 1];
            if((currentSum / k) >= threshold){
                count++;
            }
            //to avoid double counting on left pointer
            currentSum -= arr[i];
        }
        return count;
    }
}
