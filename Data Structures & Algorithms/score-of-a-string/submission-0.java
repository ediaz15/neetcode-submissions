class Solution {
    public int scoreOfString(String s) {
         //need ascii value of each character
         //order of the operation doesn't matter since we are using Math.abs
         //add them up as we go
         //a sliding window could be used
         //size 2
         
         
         //code
         //[co]de
         //c[od]e
         //co[de]
         //3 subarrays for a length of 4
         //what if we are dealing with odd
         //would the sliding window need to treat it like a circular array? (fold index using %)

         int score = 0;
         int j = 0;
         for(int i = 0; i < s.length() - 1; i++){
            j = i + 1; //should fold onto other side
            score += Math.abs((int) s.charAt(i) - (int) s.charAt(j));
         }
         return score;
    }
}