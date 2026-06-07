class Solution {
    public int trap(int[] height) {
        //skips zeroes
        //use two pointers
        //figure out formula to get the height
        // the area is like a rectangle: width * height
        // height being the height of the bars -> should only go up to the smaller bar
        //width being the space between them -> use indexes and find their difference (j - i)
        


        //max area can be calculated as: Math.min(height[i], height[j]) * (j-i)
        //setup two pointers
        //track overall max
        //inwards traversal, stop at mid
            //track max area based on indexes
                //if currentMax > overallMax
                   //take overall max
                //reduce pointers as you go
                //if left bar < right bar
                    //increase left pointer
                //if left bar > right bar
                    //decrease right pointer
            //after viewing the vid a bit: didnt calculate the max columns, just based comparison on the maxes
            //neetcode tracks the result as: result = max[left or right] - height[left or right]
                //we need to store the prefixMax and the suffixMax as we iterate (left-pre, right-suf)
            //we need to subtract the height of each bar BECAUSE it isnt water
            //need to do this for each bar
            //the remaining area is the watter
        int i = 0;
        int j = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        
        while(i < j){
            //calculate maxes on left side and right side
            rightMax = Math.max(rightMax, height[j]);
            if(height[i] < height[j]){
                leftMax = Math.max(leftMax, height[i]);
                //if the prev max was 2, and the new is 3, 3-2=1, add to area cuz it stores another block of water
                result += leftMax - height[i];
                i++;
            } else {
                rightMax = Math.max(rightMax, height[j]);
                result += rightMax - height[j];
                j--;
            }
        }
        return result;
    }
}