class Solution {
    public int maxArea(int[] heights) {
        //whats the formula hmmmm
        //integer 7 and 6
        //indeces = 1, 7
        //somehow equal 36
        //max one doesnt matter so we need to focus on the lesser bar
        //the lesser bar is the on responbile for the heights
        //if the bar is 7 and 6, the most area we can get is 6x6 since it would be like a rectangle
        //we draw the rectangle based on the lowest bar
        //and the index pos from right-left
        //area is width times height
        //so (j-i) gives us the width
        //min(num[i], num[j]) gives us the height
        //6 in this case
        //
        //(j-i) * min(num[i], num[j])

        //thats for the formula for the area


        //to test each index (instead of every combination)
        //we can do a two pointer approach

        //inwards traversal
        //if height <= max i++;
        //if height > max j--; AND max = height
        //we test every pair until we find the max
        int i = 0;
        int j = heights.length - 1;
        int max = 0;
        while(i < j){
            int height = Math.min(heights[i], heights[j]) * (j-i);
            max = Math.max(max, height);
            //we check a new number at index i++ since we already matched with max
            // <= instead of < otherwise it doesnt increment correctly

            //we used height <= max before -> need heights[i] <= heights[r]
            //why????
            //to check if leftest pole is lesser -> if lesser than the rightest
            //move the pole, otherwise the opposite happens
            if(heights[i] <= heights[j]){
                i++;
            } else {
                //heights[i]>=heights[j]
                j--;
            }
        }
        return max;
    }
}
