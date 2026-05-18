class Solution {
    public int minimumRecolors(String blocks, int k) {
        //keep track of min W (since B is the other option, we dont need to cuont them)
        //iterate through array while keeping currentWcount and minWcount
        //as you setup sliding window(stop when j < blocks.length()),
            //count if W as j++
            //when i++, decrement if W (to stop double counting)
            //min(currentWCount, minWCount)
        int currentW = 0;
        //goes up to k
        for(int i = 0; i < k; i++){
            if((int) blocks.charAt(i) == 87){
                currentW++;
            }
        }
        int minW = currentW;
        int b = 0;
        for(int j = k; j < blocks.length(); j++){
            if((int) blocks.charAt(j) == 87){
                currentW++;
            } 
            if((int) blocks.charAt(b) == 87){
                currentW--;
            }
            b++;
            minW = Math.min(minW, currentW);
        }        
        return minW;

    }
}